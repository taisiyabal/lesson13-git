package com.example;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Before test");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After test");
    }

    @Test
    public void doubleNumberReturnsDouble() {
        System.out.println("Test 1");
        Assert.assertEquals(Calculator.doubleNumber(5), 10);
    }

    @Test
    public void doubleNumberOfZeroIsZero() {
        System.out.println("Test 2");
        Assert.assertEquals(Calculator.doubleNumber(0), 0);
    }
}