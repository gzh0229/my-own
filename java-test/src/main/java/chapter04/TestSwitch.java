package chapter04;

import org.junit.Test;

public class TestSwitch {

	@Test
	public void test01() {
		int a = 1;
		switch (a) {
		case 0:
			System.out.println("0");
			break;
		case 1:
		case 2:
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		}

	}

}
