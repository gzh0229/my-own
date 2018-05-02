package chapter04;

import org.junit.Test;

public class TestBreak {

	@Test
	public void test01() {
		int i = 1;
		while (i > 0) {
			System.out.println(i);
			i++;
			if (i == 10)
				break;
		}
	}

	@Test
	public void test02() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("i=" + i);
			for (int j = 0; j <= 10; j++) {
				System.out.println("j=" + j);
				if (j == 4) {
					break;
				}
			}
			if (i == 6) {
				break;
			}
			System.out.println();
		}
	}

	@Test
	public void test03() {
		// 在循环前加标签，break后跟标签，在嵌套循环中可指定中断哪个循环，标签的名称是自定义的
		out: for (int i = 0; i <= 10; i++) {
			System.out.println("i=" + i);
			for (int j = 0; j <= 10; j++) {
				System.out.println("j=" + j);
				if (j == 4) {
					break out;
				}
			}
			System.out.println();
		}
	}

}
