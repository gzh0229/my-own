package com.java.testng.test;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {

	@Test(groups = "aa")
	public void groups01() {
		System.out.println("groups01...");
	}

	@Test(groups = "aa")
	public void groups02() {
		System.out.println("groups02...");
	}

	@Test(groups = "bb")
	public void groups03() {
		System.out.println("groups03...");
	}

	@Test(groups = "bb")
	public void groups04() {
		System.out.println("groups04...");
	}

	@BeforeGroups("aa")
	public void beforeGroups() {
		System.out.println("beforeGroups aa...");
	}

	@AfterGroups("aa")
	public void afterGroups() {
		System.out.println("afterGroups aa...");
	}

}
