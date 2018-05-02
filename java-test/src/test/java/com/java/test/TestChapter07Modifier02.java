package com.java.test;

import chapter07.TestModifier;

public class TestChapter07Modifier02 extends TestModifier {

	public static void main(String[] args) {
		TestModifier tm = new TestModifier();
		tm.getName01();
		TestChapter07Modifier02 tcm = new TestChapter07Modifier02();
		tcm.getName01();
		tcm.getName02();
		System.out.println(tcm.name01);
		System.out.println(tcm.name02);
	}

}
