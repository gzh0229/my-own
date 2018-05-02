package chapter05;

import org.junit.Test;

public class TestString {

	// 给字符串赋值
	@Test
	public void test01() {
		// 引用字符串常量赋值
		String a = "你好";
		// 引用字符串变量赋值
		String b = a;
		// 使用构造方法赋值
		String c = new String("早上");
		String d = new String(c);
		String e = "星期六", f = "星期天";
		String g;
		g = "再见";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}

	@Test
	public void test02() {
		char[] x = { '星', '期', '一', '去', '上', '班' };
		String a = new String(x);
		String b = new String(x, 2, 2);
		System.out.println(a);
		System.out.println(b);
	}

	@Test
	public void test03() {
		String a = "123" + "456";
		String b = a;
		String c = a + "789";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	@Test
	public void test04() {
		// 将字符串同其他基本数据类型进行连接，会将这些数据转换成字符串
		String a = "你好" + 123;
		double b = 3.14;
		String c = "你好" + b;
		System.out.println(a);
		System.out.println(c);
	}

	@Test
	public void test05() {
		// “hello”是字符串常量
		System.out.println("hello!");
	}

	@Test
	public void test06() {
		String a = "明天去   上班";
		// int java.lang.String.length() 返回字符串长度，返回的长度包括字符串中的空格
		int size = a.length();
		System.out.println(size);
	}

	@Test
	public void test07() {
		String a = "8888";
		String b = "B888";
		// int java.lang.String.indexOf(String str)
		// 返回指定子字符串在此字符串中首次出现的索引位置，如果没有，则返回 -1。
		if (a.indexOf("B") > -1) {
			System.out.println("a");
		}
		if (b.indexOf("B") > -1) {
			System.out.println("b");
		}
	}

	@Test
	public void test08() {
		String x = "好好学习，天天向上";
		int a = x.lastIndexOf("");
		int b = x.length();
		System.out.println(a);
		System.out.println(b);
	}

	@Test
	public void test09() {
		String x = "好好学习，天天向上";
		char a = x.charAt(2);
		System.out.println(a);
	}

	@Test
	public void test10() {
		String x = "we are the world";
		System.out.println(x.indexOf("e"));
	}

	@Test
	public void test11() {
		String x = "we are the world";
		System.out.println(x.indexOf("e", 4));
	}

	@Test
	public void test12() {
		String x = "let it go!let it go!";
		System.out.println(x.lastIndexOf("t"));
	}

	@Test
	public void test13() {
		String x = "wlet it go!let it go!";
		//返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索
		System.out.println(x.lastIndexOf("t", 7));
	}

}
