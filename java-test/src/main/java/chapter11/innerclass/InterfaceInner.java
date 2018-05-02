package chapter11.innerclass;

interface OutInterface {
	public void f();
}

public class InterfaceInner {

	public static void main(String[] args) {
		OuterClass2 out = new OuterClass2();
		OutInterface oi = out.doit();
		// 接口引用调用的是实现接口的类中的方法
		oi.f();

	}

}

class OuterClass2 {

	// private修饰的私有内部类，无法在 OuterClass2类以外实例化对象
	private class InnerClass implements OutInterface {

		InnerClass() {
			System.out.println("实例化 private私有内部类对象...");
		}

		@Override
		public void f() {
			System.out.println("访问 private私有内部类中的方法...");
		}

	}

	// 返回 OutInterface接口
	public OutInterface doit() {
		// 实现类向上转型为接口
		OutInterface oi = new InnerClass();
		return oi;
	}
}
