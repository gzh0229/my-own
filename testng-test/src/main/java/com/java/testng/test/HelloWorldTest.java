package com.java.testng.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloWorldTest {
	
  @Test(dataProvider = "dp")
  public void checkAdd(int a, int b,int c) {
	  HelloWorld hw = new HelloWorld();
	  int result=hw.add(a,b);
	  System.out.println("result:"+result);
	  Assert.assertEquals(result, c);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 2,3 },
      new Object[] { 3, 4,7 },
    };
  }

  @Test
  public void print() {
    System.out.println("done...");
  }
}
