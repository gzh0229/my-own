package chapter10;

public class TestExtend03 extends TestExtend02 {

	/*
	 * 在继承机制中，创建一个子类对象，将包含一个父类对象，这个对象与父类创建的对象是一样的。当实例化子类对象时，Java
	 * 编译器会在子类的构造方法中自动调用父类的无参构造方法，父类对象也相应被实例化；
	 */
	public TestExtend03() {
		System.out.println("TestExtend03");
	}

	/*
	 * 子类与父类的方法返回值、方法名称、参数类型及个数都相同，唯一不同的是实现内容，这种重写方式被称为重构
	 */
	@Override
	public void test02() {

	}

	public static void main(String[] args) {
		TestExtend03 te = new TestExtend03();
	}

}
