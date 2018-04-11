package com.java.testng.test;

import org.testng.annotations.Test;

public class DependsOnTest {

	@Test
	public void method01() {
		System.out.println("method01...");
		throw new RuntimeException();
	}

	/*
	 * 依赖方法失败，则将跳过所有后续测试方法
	 */
	@Test(dependsOnMethods = { "method01" })
	public void method02() {
		System.out.println("method02...");
	}

	@Test(dependsOnGroups = { "groups-test" })
	public void method03() {
		System.out.println("method03...");
	}

}
