package chapter06;

import java.util.Arrays;

import org.junit.Test;

public class Practice {

	@Test
	public void test01() {
		int[] x = { 63, 4, 24, 1, 3, 15 };
		int[] y = Arrays.copyOfRange(x, 0, 4);
		int[] z = Arrays.copyOf(x, 4);
		for (int i : x) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i : y) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i : z) {
			System.out.print(i + "\t");
		}
	}

	@Test
	public void test02() {
		int[] x = { 63, 4, 24, 1, 3, -15 };
		Arrays.sort(x);
		System.out.println(x[0]);
	}

	@Test
	public void test03() {
		String[] x = new String[] { "今天", "$$", "24", "CC", "lili", "55" };
		for (String s : x) {
			System.out.print(s + "\t");
		}
		Arrays.fill(x, 2, 3, "bb");
		System.out.println();
		for (String s : x) {
			System.out.print(s + "\t");
		}
	}

	@Test
	public void test04() {
		int[][] x = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
