package chapter06;

import org.junit.Test;

public class TestBubbleSort {

	/*
	 * 冒泡排序，正序
	 */
	@Test
	public void test01() {
		int[] x = { 63, 4, 24, 1, 3, 15 };
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = 0; j < x.length - 1 - i; j++) {
				if (x[j] > x[j + 1]) {
					int temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
		}
		for (int i : x) {
			System.out.print(i + " ");
		}
	}

	/*
	 * 冒泡排序，倒序
	 */
	@Test
	public void test02() {
		int[] x = { 63, 4, 24, 1, 3, 15 };
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = 0; j < x.length - 1 - i; j++) {
				if (x[j] < x[j + 1]) {
					int temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
		}
		for (int i : x) {
			System.out.print(i + " ");
		}
	}

}
