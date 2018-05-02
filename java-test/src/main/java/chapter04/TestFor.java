package chapter04;

import org.junit.Test;

public class TestFor {

	@Test
	public void test01() {
		int x[] = { 1, 2, 3, 4, 5 };
		for (int t : x) {
			System.out.println(t);
		}
	}

	@Test
	/*
	 * 百钱买百鸡，公鸡5钱一只，母鸡3钱一只，小鸡3只一钱，各多少只鸡
	 */
	public void test02() {
		for (int cock = 0; cock <= 20; cock++) {
			for (int hen = 0; hen <= 33; hen++) {
				for (int chick = 0; chick <= 300; chick++) {
					if ((15 * cock + 9 * hen + 1 * chick == 300) && (cock + hen + chick == 100)) {
						System.out.println("cock=" + cock);
						System.out.println("hen=" + hen);
						System.out.println("chick=" + chick);
						System.out.println();
					}
				}
			}
		}
		System.out.println("...");
	}

	@Test
	public void test03() {
		int sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);
	}

	@Test
	public void test04() {
		int[] x = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
