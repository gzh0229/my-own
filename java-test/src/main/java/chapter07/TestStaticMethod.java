package chapter07;

public class TestStaticMethod {

	public static int x = 0;

	// 静态方法里不能直接调用非静态的方法和成员变量
	public static void add() {
		x += 2;
		System.out.println(x);
		// 静态方法中不可以使用 this 关键字
		// retuen this;
	}

	// 调用类的静态方法，无需创建类的对象
	public static void main(String[] args) {
		add();
	}

}
