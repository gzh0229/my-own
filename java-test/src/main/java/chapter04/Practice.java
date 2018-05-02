package chapter04;

import org.junit.Test;

public class Practice {

	@Test
	public void test01() {
		int a = 0;
		if (a % 2 == 1) {
			System.out.println("奇数！");
		} else if (a % 2 == 0) {
			System.out.println("偶数！");
		} else {
			System.out.println("无法判断！");
		}
	}

	@Test
	public void test02() {

	}

}
