package com.java.testng.test;

import org.testng.annotations.*;

public class BeforeAndAfter {

    @BeforeTest
    public void testBeforeTest() {
        System.out.println("@BeforeTest...");
    }

    @AfterTest
    public void testAfterTest() {
        System.out.println("@AfterTest...");
    }

    @BeforeMethod
    public void testBeforeMethod() {
        System.out.println("@BeforeMethod...");
    }

    @AfterMethod
    public void testAfterMethod() {
        System.out.println("@AfterMethod...");
    }

    @BeforeClass
    public void testBeforeClass() {
        System.out.println("@BeforeClass...");
    }

    @AfterClass
    public void testAfterClass() {
        System.out.println("@AfterClass...");
    }

    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("@BeforeSuite...");
    }

    @AfterSuite
    public void testAfterSuite() {
        System.out.println("@AfterSuite...");
    }

    @BeforeGroups("xx")
    public void testBeforeGroups() {
        System.out.println("@BeforeGroups...");
    }

    @AfterGroups("xx")
    public void testAfterGroups() {
        System.out.println("@AfterGroups...");
    }

    @Test(groups = "xx")
    public void test() {
        System.out.println("test...");
    }

}
