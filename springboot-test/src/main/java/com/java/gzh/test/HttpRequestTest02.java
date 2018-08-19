package com.java.gzh.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping(value = "/class")
public class HttpRequestTest02 {

	@Value("${name}")
	private String name;

	@Value("${age}")
	private String age;

	@Value("${context}")
	private String context;

	//
	@Autowired
	UserProperties user;

	// 配置url映射关系
	@RequestMapping(value = "/hello02", method = RequestMethod.GET)
	public String hello02() {
		System.out.println(user.getMob() + " " + user.getGender());
		System.out.println(",,," + JSONObject.toJSONString(user) + ",,,");
		return "hello " + name + " " + age + " " + context;
	}

}
