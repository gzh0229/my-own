package chapter11.innerclass;

public class TestInnerClass02 {

	private int x = 1;

	private class InnerClass {

		private int x = 2;

		public void test01(int x) {
			// 调用形参 x
			System.out.println(++x);
			// 调用内部类的变量 x
			System.out.println(++this.x);
			// 调用外部类的变量 x
			System.out.println(++TestInnerClass02.this.x);
		}
	}

	public InnerClass getInnerClass() {
		return new InnerClass();
	}

	public static void main(String[] args) {
		TestInnerClass02 outer = new TestInnerClass02();
		TestInnerClass02.InnerClass inner = outer.getInnerClass();
		inner.test01(5);
	}

}
