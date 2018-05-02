package chapter11.innerclass;

public class TestInnerClass07 {

	int x;
	static int y;

	static class InnerClass {

		public void test01() {
			// 不能从静态内部类访问非静态外部类的类成员
			// System.out.println(x);
			System.out.println(y);
		}
	}

	public static void main(String[] args) {
		// 创建静态内部类的对象，不需要使用外部内对象
		InnerClass ic = new InnerClass();
		ic.test01();
	}

}
