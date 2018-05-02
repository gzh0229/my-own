package chapter11.innerclass;

interface InnerInterface {
	public void Doit();
}

/*
 * 内部类可以在类的类的局部位置定义，包括方法或任意作用域中
 */
public class TestInnerClass05 {

	public InnerInterface test01(String str) {

		// 局部内部类
		class InnerClass implements InnerInterface {

			@Override
			public void Doit() {
				System.out.println(str);
			}

		}

		return new InnerClass();

	}

	public static void main(String[] args) {
		TestInnerClass05 tic = new TestInnerClass05();
		// 接口引用调用的是实现类所实现的方法
		tic.test01("hi").Doit();
	}

}
