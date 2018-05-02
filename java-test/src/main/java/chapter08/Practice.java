package chapter08;

import org.junit.Test;

public class Practice {

	Integer i01 = new Integer(5);
	int i02 = i01.intValue();

	@Test
	public void test01() {
		Character c01 = new Character('A');
		Character c02 = new Character('a');
		System.out.println(c01.equals(c02));
		// toLowerCase(char ch) 的参数给的是 Character对象，但运行正常，可能JDK进行了自动转换
		// 将 toLowerCase(char ch) 返回的 char类型变量赋给了 Character对象，但运行正常，可能JDK进行了自动转换
		Character c03 = Character.toLowerCase(c01);
		Character c04 = Character.toLowerCase(c02.charValue());
		System.out.println(c03.equals(c04));
	}

	@Test
	public void test02() {
		Boolean b01 = new Boolean("yes");
		String b02 = b01.toString();
		System.out.println(b02);
		Boolean b03 = new Boolean("true");
		System.out.println(b03);
	}

}
