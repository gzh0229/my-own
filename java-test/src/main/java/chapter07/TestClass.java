package chapter07;

public class TestClass {

	public TestClass(String str) {
		System.out.println("构造方法");
	}

	public static void main(String[] args) {
		TestClass tc = new TestClass("ddd");
	}

}
