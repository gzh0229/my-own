package chapter10;

import org.junit.Test;

/*
 * 向下转型（显示类型转换、强转）
 */
public class TestExtend06 extends TestExtend04 {

	/*
	 * 越抽象的对象（父类对象）具有的特性越少，越具体的对象（子类对象）具有的特性越多
	 * 将特性范围小（父类）的对象转换为特性范围大（子类）的类型时，需要强转转换，否则编译会报错
	 */
	@Test
	public void doSomething() {
		TestExtend06 t = (TestExtend06) new TestExtend04();
	}

}
