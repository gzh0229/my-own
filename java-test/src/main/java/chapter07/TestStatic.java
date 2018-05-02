package chapter07;

/*
 * 静态代码块、代码块、构造方法、成员方法的运行顺序
 */
public class TestStatic {

	public void test01() {
		System.out.println("这是成员方法");
	}

	{
		System.out.println("这是代码块");
	}

	public TestStatic() {
		System.out.println("这是构造方法");
	}

	static {
		System.out.println("这是静态代码块");
	}

	public static void main(String[] args) {
		TestStatic ts = new TestStatic();
		ts.test01();
	}

}
