package chapter16;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class TestConstructor {

	@Test
	public void test01() {
		Example01 e = new Example01("10", "20", "30");
		// 返回 JVM中正在运行的 Java对象
		Class<? extends Example01> c = e.getClass();
		// 返回所有构造方法
		Constructor<?>[] dcs = c.getDeclaredConstructors();
		for (int i = 0; i < dcs.length; i++) {
			System.out.println(dcs[i]);
			// 是否带有可变数量的参数
			if (dcs[i].isVarArgs()) {
				// 按照声明顺序以 Class数组的形式获得该构造方法的各个参数的类型
				Class<?>[] para = dcs[i].getParameterTypes();
				for (int j = 0; j < para.length; j++) {
					System.out.println(para[i]);
				}
			}
			System.out.println();
		}

	}

}
