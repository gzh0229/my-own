package chapter09;

import java.math.BigInteger;

import org.junit.Test;

/*
 * 大整数
 */
public class TestClassBigInteger {

	@Test
	public void test01() {
		// 实例化一个大数字对象
		BigInteger bi01 = new BigInteger("123456789");
		BigInteger bi02 = new BigInteger("987654321");
		BigInteger bi03 = new BigInteger("222222222");
		BigInteger bi04 = new BigInteger("222222222");
		// 加
		System.out.println(bi01.add(bi02));
		// 减
		System.out.println(bi02.subtract(bi01));
		// 乘
		System.out.println(bi03.multiply(bi04));
		// 除
		System.out.println(bi02.divide(bi01));
		// 取余
		System.out.println(bi02.remainder(bi01));
		// 用数组返回商和余数，数组中第一个值为商，第二个值为余数
		BigInteger[] BI = bi02.divideAndRemainder(bi01);
		for (BigInteger b : BI) {
			System.out.println(b);
		}
		// 参数的 n次方
		System.out.println(bi03.pow(2));
		// 比较大小
		System.out.println(bi01.compareTo(bi02));// 小于返回负数
		System.out.println(bi03.compareTo(bi04));// 等于返回0
		System.out.println(bi02.compareTo(bi01));// 大于返回正数

		System.out.println(bi01.equals(bi02));
		System.out.println(bi03.equals(bi04));

		System.out.println(bi01.max(bi02));
		System.out.println(bi01.min(bi02));
	}

}
