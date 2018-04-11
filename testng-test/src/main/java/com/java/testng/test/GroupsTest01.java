package com.java.testng.test;

import org.testng.annotations.Test;

@Test(groups = "groups-test")
public class GroupsTest01 {

	public void test01() {
		System.out.println("groups-test...01..01");
	}

	public void test02() {
		System.out.println("groups-test...01...02");
	}

}
