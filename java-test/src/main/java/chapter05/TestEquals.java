package chapter05;

import org.junit.Test;

public class TestEquals {

	@Test
	public void test01() {
		String a = "学习";
		String b = "学习";
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}

	@Test
	public void test02() {
		String a = new String("abc");
		String b = new String("abc");
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}

	@Test
	public void test03() {
		String a = new String("abc");
		String b = new String("Abc");
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
	}

	@Test
	public void test04() {
		String a = new String("a");
		String b = new String("b");
		String c = new String("a");
		// 按字典顺序比较两个字符串，相等时返回0
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
	}

}
