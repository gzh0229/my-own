package chapter05;

import org.junit.Test;

public class TestString03 {

	@Test
	public void test01() {
		String x = "abC dEf";
		String a = x.toUpperCase();
		String b = x.toLowerCase();
		System.out.println(a);
		System.out.println(b);
	}

	@Test
	public void test02() {
		String x = "一 二三aB cd";
		String a = x.toUpperCase();
		String b = x.toLowerCase();
		System.out.println(a);
		System.out.println(b);
	}

	@Test
	public void test03() {
		String x = "abcd,efgh,ijkl";
		String y = "192.168.1.1";
		String a[] = x.split(",");
		// String.split(String regex, int limit)支持正则表达式
		// 直接写“.”会被认为是在使用正则表达式，写“\.”会被认为在使用转义字符
		String b[] = y.split("\\.", 2);
		for (String i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (String j : b) {
			System.out.print(j + "\t");
		}
	}

	@Test
	public void test04() {
		String a = new String();
		a = "eee";
		System.out.println(a);
	}

}
