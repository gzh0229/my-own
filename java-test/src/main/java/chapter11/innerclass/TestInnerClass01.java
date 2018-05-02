package chapter11.innerclass;

public class TestInnerClass01 {

	// 成员内部类
	class innerClass {

		// 内部类成员变量
		int x = 1;

		// 内部类构造方法
		innerClass() {
			System.out.println("内部类构造方法...");
		}

		// 内部类成员方法
		public void innerTest01() {
			// 内部类可以随意调用外部类的成员变量及成员方法，即便这些类成员被声明为 private
			System.out.println(x + y);
			outerTest01();
		}

	}

	private int y = 2;

	// 在外部类实例化一个内部类对象
	innerClass ic = new innerClass();

	private void outerTest01() {
		System.out.println("outerTest01()...");
		// 外部类不可以直接访问内部类成员变量
		System.out.println(ic.x);
	}

	private void outerTest02() {
		// 外部类不可以直接访问内部类成员方法
		ic.innerTest01();
	}

	public innerClass getInnerClass() {
		return new innerClass();
	}

	public static void main(String[] args) {
		TestInnerClass01 toc = new TestInnerClass01();
		// 在外部类之外实例化内部类对象，必须在 new操作符之前提供一个外部类引用
		TestInnerClass01.innerClass ic01 = toc.new innerClass();
		// 在外部类的非静态方法中实例化内部类对象
		TestInnerClass01.innerClass ic02 = toc.getInnerClass();
		// 在外部类中实例化内部类对象
		// TestOuterClass01.innerClass ic03 = toc.ic;
		ic01.innerTest01();
		toc.outerTest01();
		toc.outerTest02();
	}

}
