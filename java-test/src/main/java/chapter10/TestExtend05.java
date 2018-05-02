package chapter10;

/*
 * 向上转型（隐式类型转换）
 */
public class TestExtend05 extends TestExtend04 {

	public void doSomething() {
		// 将子类对象赋给父类的引用，这种技术被称为“向上转型”
		TestExtend04 t = new TestExtend05();
		// 将子类对象看做是父类对象，也是“向上转型”
		super.test01(new TestExtend05());
	}

}
