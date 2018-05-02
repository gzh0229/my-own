package chapter11.practice;

import org.junit.Test;

interface InnerInterface {
	public void doIt();
}

public class Test01 {

	@Test
	public void test01() {
		
		InnerInterface ii = new InnerInterface() {

			@Override
			public void doIt() {
				System.out.println("doIt()...");
			}
		};
		
		ii.doIt();
	}

}
