package chapter04;

import org.junit.Test;

public class TestWhile {

	@Test
	public void test01() {
		int sum = 0;
		int num = 1;
		while (num <= 200) {
			sum += num;
			num++;
		}
		System.out.println(sum);
	}

	@Test
	public void test02() {
		int a = 1;
		while (true) {
			System.out.println(a);
			a++;
		}
	}

}
