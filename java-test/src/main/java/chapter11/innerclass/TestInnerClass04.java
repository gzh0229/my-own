package chapter11.innerclass;

public class TestInnerClass04 {

	public TestInnerClass04() {
		System.out.println("TestInnerClass04()...");
	}

	public static void main(String[] args) {
		// 实例化外部类时并不会调用内部类的构造方法
		TestInnerClass04 tic = new TestInnerClass04();
	}

	class InnerClass01 {

		InnerClass01() {
			System.out.println("InnerClass01()...");
		}

	}

}
