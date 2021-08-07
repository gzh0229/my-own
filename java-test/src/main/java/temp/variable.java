package temp;

import org.junit.Test;

public class variable {

	// 成员变量声明时可以不赋值，有默认值
	int age;

	@Test
	public void test02() {
		// 局部变量声明时必须赋值，没有默认值
		String name = "lili";
		int x;
		System.out.println(age);
		System.out.println(name);
		//System.out.println(x);	Compilation failed: errors: 编译错误，可能尚未初始化变量x
	}

}
