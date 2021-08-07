package math;

import org.junit.Test;

public class operation {

	@Test
	public void testLong() {
		long a = 123456789 * 987654321;
		long b = 123456789L * 987654321L;
		System.out.println(a);	// TODO -67153019  ???
		System.out.println(b);	// 121932631112635269
	}

	@Test
	public void test01() {
		// 10进制
		int a = 33;
		// 8进制
		int b = 033;
		// 16进制
		int c = 0x33;
		System.out.println(a);	//33
		System.out.println(b);	//27
		System.out.println(c);	//51
	}

	@Test
	public void test02() {
		double a = 4.35 * 100;
		double f = 4.35;
		System.out.println(a);
		/**
		 * 返回与参数最近的long，四舍五入为正无穷大。
		 * 特殊情况:
		 * 如果参数为NaN，则结果为0。
		 * 如果参数为负无穷或任何小于或等于Long值的值。MIN_VALUE，结果等于Long.MIN_VALUE的值。
		 * 如果参数为正无穷或任何大于或等于Long的值。MAX_VALUE，结果等于Long.MAX_VALUE的值。
		 * 参数:
		 * 要舍入为long的浮点值。
		 * 返回:
		 * 参数值四舍五入到最接近的长值。
		 * 参见:
		 * 长。MAX_VALUE,长。MIN_VALUE
		 */
		System.out.println(Math.round(f));
		double b = 0.1;
		double c = 2.0 - 1.9;
		System.out.println(b == c);	//false
		System.out.println(b);
		System.out.println(c);
		// 1e-6，理论上的最小值，如果两个数的差比它小，就可以认为这两个数相等
		System.out.println(Math.abs(b - c) < 1e-6);
	}

	@Test
	public void test03() {
		System.out.println("\53");	// TODO \53???
		System.out.println("\534");
	}

	@Test
	public void char01() {
		// 得到的是8的字符编码值*2
		// unicode编码，0~65536，Java中char的取值范围也是0~65536
		System.out.println('8' * 2);
		System.out.println(8 * 2);
	}

	@Test
	public void char02() {
		char a1 = 'a';
		char b1 = '汗';
		char c1 = '2';
		char d1 = '8';
		System.out.println(a1 + "\t" + b1 + "\t" + c1 + "\t" + d1);

		char a2 = 97;
		char b2 = 27721; // 汉
		char c2 = 50;
		char d2 = 56;
		System.out.println(a2 + "\t" + b2 + "\t" + c2 + "\t" + d2);

	}

	@Test
	public void char03() {
		char a = '天';
		char b = 19979;
		System.out.println("“天”在Unicode中的排序编号是：" + (int) a);
		System.out.println("Unicode表中第19979位是：" + (char) b);
	}

	@Test
	public void test04() {
		char a = '\\';
		char b = '\u2605';
		System.out.println(a);	//	\
		System.out.println(b);	//	★
	}

	@Test
	public void test05() {
		// Java中允许使用汉字或其他语言文字作为变量名，在程序运行时不会出现错误，但建议不要这样使用
		String 我的名字 = "望山";
		System.out.println("我的名字是：" + 我的名字);
	}

	// 成员变量具有默认值，在声明时可以不赋值
	int x;
	// 成员常量在声明时必须赋值，否则编译会报错
	final double PI = 3.14;
	// final double AA;

	@Test
	public void test06() {
		// 局部变量没有默认值，在声明时必须赋值，否则会出错
		int a = 1;
		System.out.println(x);
		System.out.println(PI);
		System.out.println(a);
	}

	@Test
	public void test07() {
		// 局部变量可与成员变量的名字相同，此时成员变量将被隐藏，即这个成员变量在此方法中暂时失效
		int x = 1;
		System.out.println(x);
	}

	@Test
	public void test08() {
		int a = 1;
		int b = 1;
		// 先将a的值加1，然后赋给c
		int c = ++a;
		// 先将b的值赋给d，然后b的值再加1
		int d = b++;
		System.out.println(c);
		System.out.println(d);
	}

	@Test
	public void test09() {
		int a = 16;
		int b = 16;
		System.out.println(a << 3);	// TODO ???
		System.out.println(b >> 3);	// TODO ???
	}

	@Test
	public void test10() {
		byte a = 127;
		char b = 56;
		System.out.println(a / b);	// TODO 2 ???
	}

	@Test
	public void test11() {
		int a = (int) '8';
		System.out.println(a);
	}

	@Test
	public void test12() {
		byte a = (byte) 128;
		System.out.println(a);
	}

	@Test
	public void test13() {
		int a = 2;
		double b = 2.0;
		if (a == b) {
			System.out.println("ok!");
		}
	}

}
