package com.java.test;

import chapter07.testmodifier.Modifier;

/*
 * 其他包
 */
public class TestModifier01 {

	public static void main(String[] args) {
		Modifier m = new Modifier();
		m.testPublic();
		// m.testProtected();
		// m.testDefault();
		// m.testPrivate();
	}

}
