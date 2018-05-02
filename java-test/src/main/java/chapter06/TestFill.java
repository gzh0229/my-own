package chapter06;

import java.util.Arrays;

import org.junit.Test;

public class TestFill {

	@Test
	public void test01() {
		int[] x = { 1, 2, 3, 4, 5 };
		Arrays.fill(x, 8);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		Arrays.fill(x, 1, 3, 9);
		System.out.println("--------------");
		for (int i : x) {
			System.out.println(i);
		}
	}

}
