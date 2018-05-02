package chapter11.testfinal;

import java.util.Random;

public class TestVariable01 {

	static Random r = new Random();

	// 声明一个 final常量
	final int FI = 1;

	// 声明一个对象引用
	Test01 t01 = new Test01();

	// 声明一个 final对象引用
	final Test01 t02 = new Test01();

	// 声明一个 final数组
	final int[] x = { 1, 2, 3, 4, 5 };

	// 被定义为 final的引用指向的对象地址不会变，但对象本身会变
	final int R01 = r.nextInt(20);

	// 被定义为 static final的引用指向的对象地址不会变，对象本身也不会变
	static final int R02 = r.nextInt(20);

	public static void main(String[] args) {
		TestVariable01 tv01 = new TestVariable01();
		TestVariable01 tv02 = new TestVariable01();

		// 不能将定义为 final的引用指向其他对象
		// tv01.t02 = new Test01();

		// 可以将非 final的引用指向其他对象
		tv01.t01 = new Test01();

		// 可以改变定义为 final的对象的成员变量的值
		tv01.t02.a = 3;
		System.out.println(tv01.t01.a);
		System.out.println(tv01.t02.a);

		// 不能为定义为 final的常量赋值
		// tv01.FI=5;

		// 修改定义为 final的数组的值
		for (int i = 0; i < tv01.x.length; i++) {
			tv01.x[i] = i;
		}
		for (int i : tv01.x) {
			System.out.print(i + "\t");
		}

		System.out.println("\n-------------------");

		System.out.println(tv01.R01 + "\t" + tv01.R02);
		System.out.println(tv02.R01 + "\t" + tv02.R02);

	}

}
