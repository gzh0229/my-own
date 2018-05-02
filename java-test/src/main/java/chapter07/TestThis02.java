package chapter07;

/*
 * this 还可以调用类的构造方法
 * 但使用这种方式只可以在无参构造方法的第一句使用 this 调用有参构造方法
 */
public class TestThis02 {

	public TestThis02() {
		this("this 调用有参构造方法");
		System.out.println("无参构造方法");
	}

	public TestThis02(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		TestThis02 ts = new TestThis02();
	}

}
