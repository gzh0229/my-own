package chapter09;

import org.junit.Test;

public class TestClassMath {

	@Test
	// 指数函数
	public void test01() {
		// 圆周率常量
		System.out.println(Math.PI);
		// Math.pow(double a, double b)，返回 a的 b次方
		System.out.println(Math.pow(2, 3));
		// Math.sqrt(double a)，返回 a的平方根
		System.out.println(Math.sqrt(9));
		// Math.sqrt(double a)，返回 a的立方根
		System.out.println(Math.cbrt(8));
	}

	@Test
	// 取整函数
	public void test02() {
		// 返回大于等于参数的最小整数
		System.out.println(Math.ceil(3.5));
		System.out.println(Math.ceil(-3.5));
		// 返回小于等于参数的最小整数
		System.out.println(Math.floor(3.5));
		System.out.println(Math.floor(-3.5));
		// 返回与参数最接近的整数，如果有两个整数同样接近，则取偶数整数
		System.out.println(Math.rint(3.5));
		System.out.println(Math.rint(-3.5));
	}

	@Test
	// 较大值、较小值、绝对值
	public void test03() {
		// Math.max(int a, int b)，返回 a和 b之间的较大的数
		System.out.println(Math.max(2, 4));
		// Math.min(double a, double b)，返回 a和 b之间的较小的数
		System.out.println(Math.min(2, 3.5));
		// 返回参数的绝对值
		System.out.println(Math.abs(-8.8));
		// Math.round(double a)，四舍五入
		System.out.println(Math.round(2.4));
		System.out.println(Math.round(2.5));
	}

	@Test
	// 随机数
	public void test04() {
		// 返回 0~1之间的随机数
		System.out.println(Math.random());
		// 返回 0~3之间的随机数
		System.out.println(Math.random() * 3);
		// 返回 2~8之间的随机整数
		System.out.println(2 + (int) (Math.random() * 6));
		System.out.println((int) 0.1);
	}

	@Test
	// 返回 0~10之间的随机偶数
	public void test05() {
		int x = (int) (Math.random() * 10);
		if (x % 2 != 0) {
			x += 1;
		}
		System.out.println(x);
	}

	@Test
	// 获取随机字符
	public void test06() {
		char a = 'a';
		char z = 'z';
		char A = 'A';
		char Z = 'Z';
		char char01 = '一';
		char char02 = '十';
		char x = (char) (a + Math.random() * (z - a + 1));
		char y = (char) (A + Math.random() * (Z - A + 1));
		char char03 = (char) (char01 + Math.random() * (char02 - char01 + 1));
		System.out.println(x);
		System.out.println(y);
		System.out.println(char03);
	}

}
