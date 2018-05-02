package chapter07;

public class TestObject02 {

	int i = 10;

	public void test01() {
		for (i = 0; i < 3; i++) {
			System.out.print(i + "\t");
		}
	}

	public static void main(String[] args) {
		TestObject02 to01 = new TestObject02();
		TestObject02 to02 = new TestObject02();
		to01.test01();
		System.out.println();
		to02.test01();
	}

}
