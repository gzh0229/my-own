package chapter04;

import java.util.Scanner;

import org.junit.Test;

public class TestDoWhile {

	@Test
	public void test01() {
		Scanner sc = new Scanner(System.in);
		String pwd1;
		String pwd2;
		do {
			System.out.println("请输入第一个数：");
			pwd1 = sc.nextLine();
			System.out.println("请输入第一个数：");
			pwd2 = sc.nextLine();
			if (!pwd1.equals(pwd2))
				System.out.println("两次输入不一致，请重新输入！");
		} while (!pwd1.equals(pwd2));
		System.out.println("ok!");
		sc.close();
	}

}
