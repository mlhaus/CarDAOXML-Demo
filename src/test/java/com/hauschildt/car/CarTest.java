/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hauschildt.car;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author k0519415
 */
public class CarTest {
    
    public CarTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getLicensePlate method, of class Car.
     */
    @Test
    public void testGetLicensePlate() {
        Car instance = new Car();
        String expResult = "XXX-XXX";
        String result = instance.getLicensePlate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLicensePlate method, of class Car.
     */
    @Test
    public void testSetLicensePlate() {
        String licensePlate = "ABC-123";
        Car instance = new Car();
        instance.setLicensePlate(licensePlate);
        assertEquals(licensePlate, instance.getLicensePlate());
    }

    /**
     * Test of getMake method, of class Car.
     */
    @Test
    public void testGetMake() {
        System.out.println("getMake");
        Car instance = new Car();
        String expResult = "";
        String result = instance.getMake();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMake method, of class Car.
     */
    @Test
    public void testSetMake() {
        System.out.println("setMake");
        String make = "";
        Car instance = new Car();
        instance.setMake(make);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModel method, of class Car.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        Car instance = new Car();
        String expResult = "";
        String result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModel method, of class Car.
     */
    @Test
    public void testSetModel() {
        System.out.println("setModel");
        String model = "";
        Car instance = new Car();
        instance.setModel(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModelYear method, of class Car.
     */
    @Test
    public void testGetModelYear() {
        System.out.println("getModelYear");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getModelYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModelYear method, of class Car.
     */
    @Test
    public void testSetModelYear() {
        System.out.println("setModelYear");
        int modelYear = 0;
        Car instance = new Car();
        instance.setModelYear(modelYear);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHighestAllowedModelYear method, of class Car.
     */
    @Test
    public void testGetHighestAllowedModelYear() {
        System.out.println("getHighestAllowedModelYear");
        int expResult = 0;
        int result = Car.getHighestAllowedModelYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetLowestAllowedModelYear() {
        System.out.println("getHighestAllowedModelYear");
        int expResult = 0;
        int result = Car.getHighestAllowedModelYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Car.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Car instance = new Car();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Car.
     */
    @Test
    public void testCompareToPositive() {
        System.out.println("compareTo");
        Car other = null;
        Car instance = new Car();
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testCompareToNegative() {
        System.out.println("compareTo");
        Car other = null;
        Car instance = new Car();
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testCompareToEqual() {
        System.out.println("compareTo");
        Car other = null;
        Car instance = new Car();
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
