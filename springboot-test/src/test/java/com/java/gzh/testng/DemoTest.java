package com.java.gzh.testng;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import com.java.gzh.Application;

@SpringBootTest(classes=Application.class)
public class DemoTest extends AbstractTestNGSpringContextTests {
	
}
