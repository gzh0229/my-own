package com.java.testng.test;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {

	/*
	 * 预期异常
	 */
	@Test(expectedExceptions = ArithmeticException.class)
	public void expectedTest() {
		System.out.println(3 / 0);
	}

}
