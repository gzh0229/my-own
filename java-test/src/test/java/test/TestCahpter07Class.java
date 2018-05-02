package test;

import chapter07.TestClass02;

public class TestCahpter07Class {

	public static void main(String[] args) {
		// 通过静态方法获取类的对象
		TestClass02 tc = TestClass02.getObject();
		System.out.println(tc.x);
	}

}
