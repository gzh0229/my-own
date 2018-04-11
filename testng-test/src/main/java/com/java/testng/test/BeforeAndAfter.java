package com.java.testng.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeAndAfter {

	/*
	 * 在运行标注了 @Test标签的任何测试方法运行之前运行；
	 */
	@BeforeTest
	public void testBeforeTest() {
		System.out.println("@BeforeTest...");
	}

	/*
	 * 在运行标注了 @Test标签的任何测试方法运行之前运行；
	 */
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

	/*
	 * 在当前类的第一个测试方法之前运行；
	 */
	@BeforeClass
	public void testBeforeClass() {
		System.out.println("@BeforeClass...");
	}

	/*
	 * 在当前类的第一个测试方法之后运行；
	 */
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

	@BeforeGroups
	public void testBeforeGroups() {
		System.out.println("@BeforeGroups...");
	}

	@AfterGroups
	public void testAfterGroups() {
		System.out.println("@AfterGroups...");
	}

}
