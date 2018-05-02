package chapter11.testfinal;

public class Parent {

	// private方法被隐式的指定为 final类型，无需将一个 private方法指定为 final类型
	private void test01() {
		System.out.println("父类 test01()...");
	}

	final void test02() {
		System.out.println("父类 test02()...");
	}

	private final void test03() {
		System.out.println("父类 test03()...");
	}

}
