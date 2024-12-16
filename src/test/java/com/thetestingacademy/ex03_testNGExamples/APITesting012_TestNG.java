package com.thetestingacademy.ex03_testNGExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting012_TestNG {

    @BeforeTest()
    public void getToken(){
        System.out.println("1");
    }

    @BeforeTest
    public void getBookingID(){
        System.out.println("2");
    }

    @Test
    public void test_PUT(){
        // token and BookingID
        System.out.println("3");
    }

    @AfterTest
    public void closeAllThings(){
        System.out.println("Close");
    }






}
