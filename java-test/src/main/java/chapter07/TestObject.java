package chapter07;

public class TestObject {

	private String name = "lili";

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		TestObject to = new TestObject();
		// to 是一个对象的引用
		System.out.println(to.getName());
		// new TestObject() 才是一个对象实例
		System.out.println(new TestObject().getName());
	}
}
