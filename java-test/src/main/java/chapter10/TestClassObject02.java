package chapter10;

import org.junit.Test;

public class TestClassObject02 {

	/*
	 * 用 equals()比较自定义类的对象时，将返回 false；要比较两个自定义对象的内容，需要在自定义类中重写 equals()方法
	 */
	@Test
	public void test01() {
		String str01 = new String("hi");
		String str02 = new String("hi");
		System.out.println(str01.equals(str02));
		TestClassObject01 tco01 = new TestClassObject01();
		TestClassObject01 tco02 = new TestClassObject01();
		System.out.println(tco01.equals(tco02));
		int[] x = { 1, 2, 3 };
		int[] y = { 1, 2, 3 };
		System.out.println(x.equals(y));
	}

}
