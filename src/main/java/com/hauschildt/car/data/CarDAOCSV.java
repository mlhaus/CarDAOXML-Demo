/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hauschildt.car.data;

import com.hauschildt.car.Car;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author k0519415
 */
public class CarDAOCSV implements CarDAO {

    private static final String FILE_NAME = "cars.csv";
    private static ArrayList<Car> cars;

    private void readFromFile() throws CarDataException {
        try(Scanner in = new Scanner(new File(FILE_NAME))){
            cars = new ArrayList<>();
            int lineCount = 0;
            String line;
            String[] fields;
            String licensePlate;
            String make;
            String model;
            int modelYear;
            while(in.hasNextLine()){
                lineCount++;
                line = in.nextLine();
                fields = line.split(",");
                licensePlate = fields[0];
                make = fields[1];
                model = fields[2];
                try{
                    modelYear = Integer.parseInt(fields[3]);
                } catch(NumberFormatException nfe){
                    throw new CarDataException(nfe.getMessage()
                            + "CSV Line " + lineCount);
                }
                cars.add(new Car(licensePlate, make, model, modelYear));
            }
        } catch(FileNotFoundException fnfe){
            throw new CarDataException(fnfe);
        }
    }

    private void saveToFile() throws CarDataException {
        try(PrintWriter writer = new PrintWriter(new File(FILE_NAME))){
            String line;
            for (Car car : cars) {
                line = car.getLicensePlate() + ","
                        + car.getMake() + ","
                        + car.getModel() + ","
                        + car.getModelYear();
                writer.println(line);
            }
        } catch (FileNotFoundException ex) {
            throw new CarDataException(ex);
        }
    }
    
    private void verifyCarList() throws CarDataException {
        if(null == cars){
            readFromFile();
        }
    }

    @Override
    public void createCarRecord(Car car) throws CarDataException {
        verifyCarList();
        Car checkCar = getCarByLicensePlate(car.getLicensePlate());
        if(null != checkCar){
            throw new CarDataException("License Plates must be unique.");
        }
        cars.add(car);
        saveToFile();
    }

    @Override
    public Car getCarByLicensePlate(String licensePlate) throws CarDataException {
        verifyCarList();
        Car car = null;
        for (Car car1 : cars) {
            if(car1.getLicensePlate().equals(licensePlate)){
                car = car1;
                break;
            }
        }
        return car;
    }

    @Override
    public ArrayList<Car> getAllCars() throws CarDataException {
        verifyCarList();
        return cars;
    }

    @Override
    public void updateCar(Car original, Car updated) throws CarDataException {
        verifyCarList();
        Car foundCar = null;
        for (Car car : cars) {
            if(car.equals(original)){
                foundCar = car;
                break;
            }
        }
        if(null == foundCar){
            throw new CarDataException("Original record not found for update.");
        }
        foundCar.setMake(updated.getMake());
        foundCar.setModel(updated.getModel());
        foundCar.setModelYear(updated.getModelYear());
        saveToFile();
    }

    @Override
    public void deleteCar(Car car) throws CarDataException {
        deleteCar(car.getLicensePlate());
    }

    @Override
    public void deleteCar(String licensePlate) throws CarDataException {
        verifyCarList();
        Car foundCar = null;
        for (Car car : cars) {
            if(car.getLicensePlate().equals(licensePlate)){
                foundCar = car;
                break;
            }
        }
        if(null == foundCar){
            throw new CarDataException("Record record not found for delete.");
        }
        cars.remove(foundCar);
        saveToFile();
    }

}
