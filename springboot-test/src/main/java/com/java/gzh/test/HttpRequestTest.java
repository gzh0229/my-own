package com.java.gzh.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController // 表示该类处理http请求,自动按json格式返回
@RequestMapping(value = "/aaa")
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
		System.out.println(user.getMob() + " " + user.getGender());
		System.out.println("..." + JSONObject.toJSONString(user) + "...");
		return "hello " + name + " " + age + " " + context;
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public UserProperties getUser() {
		return user;// 自动按json格式返回
	}

	// @PathVariable
	@RequestMapping(value = "/hi/{message}", method = RequestMethod.GET)
	public String hi(@PathVariable("message") String message) {
		return "hi " + name + " " + message;
	}

	/*
	 * @GetMapping，主要是简化@RequestMapping，等同于@RequestMapping设置method=RequestMethod.GET
	 */
	@GetMapping(value = "/hei")
	public String hei(@RequestParam("word") String word) {
		return "hei " + name + " " + word;
	}

}
