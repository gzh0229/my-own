package chapter08;

import org.junit.Test;

public class TestWrapperClass {

	@Test
	public void test01() {

		// byte
		System.out.println("基本数据类型：byte 二进制位数：" + Byte.SIZE);
		System.out.println("最小值：" + Byte.MIN_VALUE);
		System.out.println("最大值：" + Byte.MAX_VALUE);
		System.out.println();

		// short
		System.out.println("基本数据类型：short 二进制位数：" + Short.SIZE);
		System.out.println("最小值：" + Short.MIN_VALUE);
		System.out.println("最大值：" + Short.MAX_VALUE);
		System.out.println();

		// int
		System.out.println("基本数据类型：int 二进制位数：" + Integer.SIZE);
		System.out.println("最小值：" + Integer.MIN_VALUE);
		System.out.println("最大值：" + Integer.MAX_VALUE);
		System.out.println();

		// long
		System.out.println("基本数据类型：long 二进制位数：" + Long.SIZE);
		System.out.println("最小值：" + Long.MIN_VALUE);
		System.out.println("最大值：" + Long.MAX_VALUE);
		System.out.println();

		// float
		System.out.println("基本数据类型：float 二进制位数：" + Float.SIZE);
		System.out.println("最小值：" + Float.MIN_VALUE);
		System.out.println("最大值：" + Float.MAX_VALUE);
		System.out.println();

		// double
		System.out.println("基本数据类型：double 二进制位数：" + Double.SIZE);
		System.out.println("最小值：" + Double.MIN_VALUE);
		System.out.println("最大值：" + Double.MAX_VALUE);
		System.out.println();

		// char
		System.out.println("基本数据类型：char 二进制位数：" + Character.SIZE);
		// 以数值形式而不是字符形式将 Character.MIN_VALUE 输出到控制台
		System.out.println("最小值：" + (int) Character.MIN_VALUE);
		// 以数值形式而不是字符形式将 Character.MAX_VALUE 输出到控制台
		System.out.println("最大值：" + (int) Character.MAX_VALUE);
		System.out.println();
	}

}
