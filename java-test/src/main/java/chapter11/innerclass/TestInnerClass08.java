package chapter11.innerclass;

class OutClass {
	class InnerClass {

	}
}

// 继承内部类
public class TestInnerClass08 extends OutClass.InnerClass {

	// 继承内部类，必须义一个带参的构造方法，方法的参数必须是外部类的引用，同时，构造方法中的语句必须是“外部类的引用.super();”
	public TestInnerClass08(OutClass out) {
		out.super();
	}

}
