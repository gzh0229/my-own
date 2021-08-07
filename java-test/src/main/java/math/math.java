package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.TODO;
import org.junit.Test;

/***
 * 加减乘除
 * @author gzh
 *
 */
public class math {

	@Test	// TODO idea里运行不了???
	public void test02() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		double a = input.nextDouble();
		System.out.println("请输入第二个数：");
		double b = input.nextDouble();
		input.close();
		System.out.println("您的输入为：" + a + "," + b);  // TODO ???
		System.out.println("计算结果为：");
		System.out.println("a+b=" + (a + b));
		System.out.println("a-b=" + (a - b));
		System.out.println("a/b=" + a / b);  // TODO "6除7等于0？？？
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
			System.out.println("您的输入为：" + a + "," + b);  // TODO ???
			System.out.println("计算结果为：");
			System.out.println("a+b=" + (a + b));
			System.out.println("a-b=" + (a - b));
			System.out.println("a/b=" + a / b);
			System.out.println("a*b=" + a * b);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test03() {
		byte a = 2;
		int b = 5;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / 1);
		System.out.println(a % 1);
	}

	@Test
	public void test04() {
		byte a = 0;
		short b = 1;
		int c = 2;
		long d = 12345678987654321L;
		System.out.println((int) a);
		System.out.println((int) b);
		System.out.println((int) c);
		System.out.println((int) d);	//TODO 超过了int的范围???
	}

}
