package chapter04;

import org.junit.Test;

public class TestContinue {

	@Test
	public void test01() {
		// for循环中遇到continue，首先执行循环的增量部分，然后进行条件测试；
		int i = 0;
		for (i = 0; i <= 5; i++) {
			if (i == 4)
				continue;
			System.out.println(i);
		}
		System.out.println("\n" + i);
	}

	@Test
	public void test02() {
		for (int i = 1; i < 21; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
