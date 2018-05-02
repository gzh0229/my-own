package chapter05;

import java.util.Scanner;

import org.junit.Test;

public class TestRegularExpression {

	@Test
	public void test01() {
		System.out.println("\\d");
		System.out.println(".");
		System.out.println("[abc]3");

	}

	/*
	 * 邮箱正则表达式
	 */
	@Test
	public void test02() {
		// 邮箱名首字母必须是英文，中间允许使用数字、字母、下划线和“.”，
		// String regex = "\\w+@\\w+\\.(\\w{2,3}\\.)*\\w{2,3}";
		String regex = "^[a-zA-Z][a-zA-Z0-9\\._]*@[a-zA-Z0-9]+\\.([a-zA-Z]{2,3}\\.)*[a-zA-Z]{2,3}$";
		String a = "abc@163.com";
		String b = "a.b_c@myemail.com.cn";
		System.out.println(a.matches(regex));
		System.out.println(b.matches(regex));
	}

	@Test
	public void test03() {
		// 电话号，第1位是1，第2位是3、5、8中的一位，共11位
		// 座机号，区号3位，号码是8位；区号4位，号码7位或8位
		Scanner sc = new Scanner(System.in);
		String regex = "^1(3|5|8)[0-9]{9}$|^([0-9]{3}-[0-9]{8})$|^([0-9]{4}-[0-9]{7,8})$";
		while (true) {
			System.out.println("请输入手机或座机号：");
			String phone = sc.nextLine();
			System.out.println(phone.matches(regex));
		}
	}

}
