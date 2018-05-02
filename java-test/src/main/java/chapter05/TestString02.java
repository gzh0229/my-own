package chapter05;

import org.junit.Test;

public class TestString02 {

	@Test
	public void test01() {
		String x = "1234567890";
		String a = x.substring(3);
		String b = x.substring(3, 5);
		System.out.println(a);
		System.out.println(b);
	}

	@Test
	public void test02() {
		// 英文空格
		String x = "    a b    c   ";
		// 中文空格
		String y = "    a b    c   ";
		String a = x.trim();
		String b = y.trim();
		System.out.println(a);
		System.out.println(b);
	}

	@Test
	public void test03() {
		String x = " a b  c ";
		System.out.println(x.length());
		// “\\s”是正则表达式中的写法，代表空白字符
		String a = x.replaceAll("\\s", "");
		System.out.println(a);
		System.out.println(a.length());
	}

	@Test
	public void test04() {
		String x = "馒头一文一个";
		String y = "翻过一座山，又见一座山";
		String a = x.replace("一", "壹");
		String b = y.replace("一座", "大");
		String c = x.replace("二", "壹");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	@Test
	public void test05() {
		String x = "Hello.java";
		boolean a = x.endsWith("java");
		boolean b = x.endsWith("jpg");
		System.out.println(a);
		System.out.println(b);
	}

	@Test
	public void test06() {
		String x = "Hello.java";
		boolean a = x.startsWith("He");
		boolean b = x.startsWith("Ha");
		System.out.println(a);
		System.out.println(b);
	}

}
