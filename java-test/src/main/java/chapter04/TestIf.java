package chapter04;

import org.junit.Test;

public class TestIf {

	@Test
	public void test01() {
		int a = 10;
		if (a == 10)
			System.out.println("ok!");

		System.out.println("...");
	}

	@Test
	public void test02() {
		if (true)
			System.out.println("ok!");
		if (false)
			System.out.println("no!");
	}

	@Test
	public void test03() {
		int a = 15;
		if (a > 0 && a <= 10) {
			System.out.println("A");
		} else if (a > 10 && a <= 20) {
			System.out.println("B");
		} else if (a > 20 && a <= 30) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}

	@Test
	public void test04() {
		boolean flag = false;
		if (flag = true) { // “=”是赋值运算符，会先将true赋给flag，然后程序判断flag的值，此处应使用逻辑运算符“==”
			System.out.println("true!");
		} else {
			System.out.println("false!");
		}
	}

	@Test
	public void test05() {
		boolean flag = false;
		if (!flag) {
			System.out.println("true!");
		} else {
			System.out.println("false!");
		}
	}

}
