package chapter11.testfinal;

public class Sub extends Parent {

	// 父类的 private方法可以被子类重写
	public void test01() {
		System.out.println("子类 test01()...");
	}

	// 父类的 final方法不能被子类重写
	// final void test02() {
	// System.out.println("子类 test02()...");
	// }

	// 父类的 final方法不能被子类重写
	// public void test02() {
	// System.out.println("子类 test02()...");
	// }

	// 此形式并不是重写了父类的 private final方法，而是生成了一个新方法
	public final void test03() {
		System.out.println("子类 test03()...");
	}

}
