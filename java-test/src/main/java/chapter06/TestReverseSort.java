package chapter06;

import org.junit.Test;

public class TestReverseSort {

	/*
	 * 反转排序
	 */
	@Test
	public void test01() {
		int[] x = { 14, 2, 5, 7, 23, 34 };
		// 只需要循环数组长度的半数次
		for (int i = 0; i < x.length / 2; i++) {
			int temp = x[i];
			x[i] = x[x.length - 1 - i];
			x[x.length - 1 - i] = temp;
		}
		for (int i : x) {
			System.out.print(i + "\t");
		}
	}

}
