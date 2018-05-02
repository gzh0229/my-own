package chapter09;

import java.util.Random;

import org.junit.Test;

/*
 * 随机数类
 */
public class TestClassRandom {

	@Test
	public void test01() {
		Random r = new Random();
		// 返回一个随机整数
		System.out.println(r.nextInt());
		// 返回大于等于 0且小于 n的随机整数
		System.out.println(r.nextInt(10));
		// 返回一个随机小数
		System.out.println(r.nextDouble());
	}

}
