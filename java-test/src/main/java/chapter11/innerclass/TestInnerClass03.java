package chapter11.innerclass;

/*
 * 定义多个内部类以不同方式实现同一接口的同一方法
 */
public class TestInnerClass03 {

	public static void main(String[] args) {
		TestInnerClass03 tic = new TestInnerClass03();
		tic.test01();
	}

	public void test01() {
		InnerClass01 ic01 = new InnerClass01();
		InnerClass02 ic02 = new InnerClass02();
		ic01.doIt();
		ic02.doIt();
	}

	class InnerClass01 implements TestInnerInterface {

		InnerClass01() {
			System.out.println("InnerClass01()...");
		}

		@Override
		public void doIt() {
			System.out.println("doIt()...01...");
		}

	}

	class InnerClass02 implements TestInnerInterface {

		@Override
		public void doIt() {
			System.out.println("doIt()...02...");
		}

	}

}
