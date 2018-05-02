package chapter07;

/*
 * this 关键字代表类本身对象的引用，this 关键字被隐式地用于引用对象的成员变量和方法， this 引用的就是本类的一个对象；
 * this 除了可以调用成员变量和方法外，还可以作为参数的返回值;
 * Java 语言中最常规的调用方式是使用“对象.成员变量”和“对象.方法”进行调用；
 */
public class TestThis {

	String name = "lili";

	// 如果一个方法中含有与成员变量同名的局部变量，则方法中对这个变量的访问以局部变量进行
	// 方法的形参也是局部变量
	public void showName(String name) {
		System.out.println(name);
		System.out.println(this.name);
	}

	// 如果一个方法中含有与成员变量同名的局部变量，可通过 this关键字访问成员变量
	public void showName() {
		String name = "kim";
		System.out.println("\n" + name);
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		TestThis tt = new TestThis();
		tt.showName("mary");
		tt.showName();
	}

	public TestThis test01() {
		return this;
	}

}
