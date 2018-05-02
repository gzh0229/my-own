package chapter07;

/*
 * 构造方法也可以用 private 修饰，私有的构造方法无法在本类外使用，也就导致在本类外无法使用 new 创建本类对象，这样可以控制对象的生成
 * 单例模式即是使用这种方法实现
 */
public class TestClass02 {

	public int x = 0;

	private TestClass02() {

	}

	public static TestClass02 getObject() {
		return new TestClass02();
	}
}
