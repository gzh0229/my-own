package chapter09;

import java.math.BigDecimal;

import org.junit.Test;

/*
 * 大小数
 */
public class TestClassBigDecimal {

	@Test
	public void test01() {
		// 实例化 BigDecimal对象
		BigDecimal bd01 = new BigDecimal("444444.4444");
		BigDecimal bd02 = new BigDecimal(222222.2222);
		BigDecimal bd03 = new BigDecimal("1");
		BigDecimal bd04 = new BigDecimal(3);
		// 加
		System.out.println(bd01.add(bd02));
		// 减
		System.out.println(bd01.subtract(bd02));
		// 乘
		System.out.println(bd01.multiply(bd02));
		// 除，保留 6位小数，小数末位处理采用 BigDecimal.ROUND_DOWN模式
		System.out.println(bd03.divide(bd04, 6, BigDecimal.ROUND_DOWN));

	}

}
