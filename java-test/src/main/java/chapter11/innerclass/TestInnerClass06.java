package chapter11.innerclass;

interface InterfaceForInnerClass {
	public void doSomething();
}

class ParentClass {
	public void test01() {

	}
}

public class TestInnerClass06 {

	public static void main(String[] args) {

		// 匿名内部类，实现 InterfaceForInnerClass接口，匿名内部类的作用，就是创建一个实现接口的对象
		InterfaceForInnerClass ific = new InterfaceForInnerClass() {
			@Override
			public void doSomething() {
				System.out.println("yes");
			}
		}; // 在匿名内部类定义结束后，需要加分号标识，这个分号代表的是引用表达式的结束

		ific.doSomething();

		// 匿名内部类，继承 ParentClass类
		ParentClass pc = new ParentClass() {
			@Override
			public void test01() {
				System.out.println("test01()...");
			}
		};
		pc.test01();
	}

}
