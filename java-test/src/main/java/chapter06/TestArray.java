package chapter06;

import java.util.Arrays;

import org.junit.Test;

public class TestArray {

	/*
	 * 一维数组
	 */
	@Test
	public void test01() {
		// 声明数组
		int a[] = new int[3];
		a[0] = 1;
		a[1] = 3;
		a[2] = 5;
		// 数组的长度可以是表达式的结果
		int b[] = new int[2 + 3];
		// 声明并赋值
		int c[] = new int[] { 1, 2, 3 };
		int d[] = { 4, 5, 6, 7 };
		String[] e = new String[5];

		// 数组长度
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println("-----------------");

		// 遍历数组
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println("-----------------");
		for (int i : d) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		// 使用 new 关键字为数组分配内存时，整型数组中各个元素的初始值都为0，字符串类型数组中各个元素的初始值都为null
		for (int i : b) {
			System.out.println(i);
		}
		for (String i : e) {
			System.out.println(i);
		}
	}

	/*
	 * 二维数组
	 */
	@Test
	public void test02() {
		int a[][] = new int[2][3];
		int[][] b = new int[][] { { 7, 8, 9 }, { 4, 5, 6 } };
		int[][] c = { { 1 }, { 2, 3 }, { 4, 5, 6 } };
		int[][] d = new int[2][3];
		d[0] = new int[] { 11, 22, 33 };
		d[1][0] = 44;
		d[1][1] = 55;
		d[1][2] = 66;
		for (int[] is : c) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	@Test
	public void test03() {
		char[][] x = { { '春', '眠', '不', '觉', '晓', '，' }, { '处', '处', '闻', '啼', '鸟', '。' },
				{ '夜', '来', '风', '雨', '声', '，' }, { '花', '落', '知', '多', '少', '。', '。' } };
		for (char[] cs : x) {
			for (char c : cs) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println(x.length);
		System.out.println(x[0].length);
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		char[][] y = new char[4][6];
		y[0] = new char[] { '春', '眠', '不', '觉', '晓', '，' };
		y[1] = new char[] { '处', '处', '闻', '啼', '鸟', '。' };
		y[2] = new char[] { '夜', '来', '风', '雨', '声', '，' };
		y[3] = new char[] { '花', '落', '知', '多', '少', '。' };
		for (int i = 0; i < y[0].length; i++) {
			for (int j = y.length - 1; j > -1; j--) {
				System.out.print(y[j][i]);
			}
			System.out.println();
		}
	}

	/*
	 * 复制数组
	 */
	@Test
	public void test04() {
		int[] x = { 0, 1, 2, 3, 4, 5, 6 };
		System.out.println("x:");
		for (int i : x) {
			System.out.print(i + "\t");
		}

		System.out.println("\n" + "z:");
		// 复制数组并指定长度，超过被复制对象则自动填充默认值，小于则舍弃后面的值
		int[] z = Arrays.copyOf(x, 10);
		for (int i : z) {
			System.out.print(i + "\t");
		}

		System.out.println("\n" + "k:");
		// int[] java.util.Arrays.copyOfRange(int[] original, int from, int to)
		// 复制指定索引范围内的数组元素，从下标 from 到 to-1
		int[] k = Arrays.copyOfRange(x, 0, 5);
		for (int i : k) {
			System.out.print(i + "\t");
		}

		System.out.println("\n" + "y:");
		int[] y = x;
		y[0] = 99;
		for (int i : y) {
			System.out.print(i + "\t");
		}
	}

}
