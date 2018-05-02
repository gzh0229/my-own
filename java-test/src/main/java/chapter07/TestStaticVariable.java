package chapter07;

import org.junit.Test;

/*
 * 类的静态变量可以被类的所有对象共享
 */
public class TestStaticVariable {

	public static int a = 0;

	@Test
	public void test01() {
		TestStaticVariable tsv01 = new TestStaticVariable();
		TestStaticVariable tsv02 = new TestStaticVariable();
		tsv01.add();
		System.out.println(tsv01.a);
		tsv02.subtract();
		System.out.println(tsv02.a);
		// 同一个类的不同实例对象，共用一个静态变量，如果一个对象更改了静态变量的值，另一个实例的静态变量的值也会改变
		System.out.println(tsv01.a);
	}

	public void add() {
		a += 2;
	}

	public void subtract() {
		a -= 1;
	}

}
