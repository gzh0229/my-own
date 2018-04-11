package com.java.testng.test;

import org.testng.annotations.Test;

public class EnabledTest {

	/*
	 * 忽略测试
	 */
	@Test(enabled = true)
	public void ignoreTest() {
		System.out.println("ignoreTest...");
	}

}
