package com.thetestingacademy.ex04_testNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting020_TestNG_invocationCount {

    @Test(invocationCount = 3)
    public void test01(){
        Assert.assertTrue(true);
    }


}
