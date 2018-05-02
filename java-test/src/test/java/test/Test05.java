package test;

import org.junit.Test;

public class Test05 {

	@Test
	public void test01() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + " ");
			}
			System.out.print("\n");
		}
	}

}
