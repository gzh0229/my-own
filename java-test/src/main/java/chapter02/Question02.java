package chapter02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.junit.Test;

/***
 * 加减乘除
 * @author gzh
 *
 */
public class Question02 {

	@Test
	public void test02() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		double a = input.nextDouble();
		System.out.println("请输入第二个数：");
		double b = input.nextDouble();
		input.close();
		System.out.println("您的输入为：" + a + "," + b);
		System.out.println("计算结果为：");
		System.out.println("a+b=" + (a + b));
		System.out.println("a-b=" + (a - b));
		System.out.println("a/b=" + a / b);
		System.out.println("a*b=" + a * b);
	}

	@Test
	public void test01() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("请输入a：");
			String x = br.readLine();
			int a = Integer.parseInt(x);
			System.out.println("请输入b：");
			int b = Integer.parseInt(br.readLine());
			System.out.println("您的输入为：" + a + "," + b);
			System.out.println("计算结果为：");
			System.out.println("a+b=" + (a + b));
			System.out.println("a-b=" + (a - b));
			System.out.println("a/b=" + a / b);
			System.out.println("a*b=" + a * b);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
