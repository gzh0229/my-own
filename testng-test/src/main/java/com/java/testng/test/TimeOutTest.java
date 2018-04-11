package com.java.testng.test;

import org.testng.annotations.Test;

public class TimeOutTest {

	@Test(timeOut = 1000)
	public void test01() throws Exception {
		Thread.sleep(2000);
	}

	@Test(timeOut = 3000)
	public void test02() throws Exception {
		Thread.sleep(2000);
	}

}
