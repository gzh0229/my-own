package chapter06;

import java.util.Arrays;

import org.junit.Test;

public class TestSort {

	@Test
	public void test01() {
		int[] x = { 14, 2, 5, 7, 23, 34 };
		double[] y = { 23.23, 5, 53.34, 4.3, 8.8 };
		Arrays.sort(x);
		Arrays.sort(y);
		for (int i : x) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (double i : y) {
			System.out.print(i + "\t");
		}

		System.out.println();
		int[] z = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			z[i] = x[x.length - 1 - i];
		}
		for (int i : z) {
			System.out.print(i + "\t");
		}

		System.out.println();
		String[] k = { "4jio驾驶", "er345建立开发", "房间里35233", "asgd登记" };
		// String类型数组的排序算法是根据字典编排顺序排序的，数字排在字母前面，大写字母排在小写字母前面
		Arrays.sort(k);
		for (String i : k) {
			System.out.print(i + "\t");
		}
	}

}
