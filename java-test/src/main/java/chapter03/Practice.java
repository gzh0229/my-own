package chapter03;

import org.junit.Test;

public class Practice {

	@Test
	public void test01() {
		byte a = 2;
		int b = 5;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / 1);
		System.out.println(a % 1);
	}

	int age;

	@Test
	public void test02() {
		String name = "lili";
		// 成员变量声明时可以不赋值，有默认值
		System.out.println(age);
		// 局部变量声明时必须赋值，没有默认值
		System.out.println(name);
	}

	@Test
	public void test03() {
		byte a = 0;
		short b = 1;
		int c = 2;
		long d = 12345678987654321L;
		System.out.println((int) a);
		System.out.println((int) b);
		System.out.println((int) c);
		System.out.println((int) d);
	}

	@Test
	public void test04() {
		long mylong = 45789;
		byte mybyte = 123;
		short myshort = 32564;
		int myint1 = (int) mylong;
		int myint2 = (int) myshort;
		int myint3 = (int) mybyte;
		System.out.println(myint1);
		System.out.println(myint2);
		System.out.println(myint3);
	}

}
