package com.java.gzh.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpRequestTest {

	@Value("${name}")
	private String name;

	@Value("${age}")
	private String age;

	@Value("${context}")
	private String context;
	
	@Autowired
	UserProperties user;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		System.out.println(user.getMob()+" "+user.getGender());
		return "hello " + name + " " + age + " " + context;
	}

}
