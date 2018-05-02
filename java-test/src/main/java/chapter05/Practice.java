package chapter05;

import java.util.Scanner;

import org.junit.Test;

public class Practice {

	@Test
	public void test01() {
		String str = "你好Helen！";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}

	@Test
	public void test02() {
		String x = "你好123abc";
		String y = "你好123bcd";
		String z = "你好234abc";
		String a = x.substring(1, 5);
		String b = y.substring(1, 5);
		String c = z.substring(1, 5);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}

	@Test
	public void test03() {
		// 电话号，第1位是1，第2位是3、5、8中的一位，共11位
		Scanner sc = new Scanner(System.in);
		String regex = "^1(3|5|8)[0-9]{9}$";
		while (true) {
			System.out.println("请输入手机号：");
			String phone = sc.nextLine();
			System.out.println(phone.matches(regex));
		}
	}

	@Test
	public void test04() {
		StringBuilder sbl = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sbl.append(i);
		}
		System.out.println(sbl);
	}
}
