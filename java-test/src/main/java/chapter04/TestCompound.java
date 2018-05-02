package chapter04;

import org.junit.Test;

public class TestCompound {

	@Test
	public void test01() {
		int a = 0;
		{
			int b = 1;
			System.out.println(a);
		}
		System.out.println(a);
	}

}
