package com.java.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class Test06 {

	@Test
	public void test01() {
		System.out.println(new Date().getTime());
		System.out.println(System.currentTimeMillis());
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		String date = df.format(new Date());
		System.out.println(date);
	}

}
