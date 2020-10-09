/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hauschildt.car.data;

/**
 *
 * @author k0519415
 */
public class CarDAOFactory {
    private static final String DAO_SOURCE = "XML";

    public static CarDAO getCarDAO(){
        CarDAO dao = null;
        switch(DAO_SOURCE){
            case "CSV":
                dao = new CarDAOCSV();
                break;
            case "XML":
                dao = new CarDAOXML();
                break;
            case "MYSQL":
                break;
            default:
        }
        return dao;
    }

}
