package chapter12.practice;

import test.MyException;

/*
 * 求最大公约数
 */
public class Question03 {

	public int test01(int x, int y) throws MyException {
		if (x < 1 || y < 1) {
			throw new MyException("参数不能小于1...");
		}
		int min = x < y ? x : y;
		int maxCommon = 1;
		for (int i = 1; i <= min; i++) {
			if (x % i == 0 & y % i == 0) {
				maxCommon = i;
			}
		}
		return maxCommon;
	}

	public static int getMaxComm(int m, int n) throws MyException {
		if (m <= 0 || n <= 0) {
			throw new MyException("传递的参数不是正整数");
		}
		if (m < n) {
			int temp = 0;
			temp = m;
			m = n;
			n = temp;
		}
		int r = m % n;
		while (r != 0) {
			m = n;
			n = r;
			r = m % n;
		}
		return n;
	}

	public static void main(String[] args) {
		Question03 q = new Question03();
		try {
			System.out.println(q.test01(12, 0));
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}
