package com.java.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailTest {

	@Test
	public void getEmail() {
		Email e = new Email();
		String email = e.getEmail();
		Assert.assertNotNull(email);
		Assert.assertEquals(email, "abc@163.com");
	}
}
