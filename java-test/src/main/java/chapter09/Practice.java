package chapter09;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

import org.junit.Test;

public class Practice {

	@Test
	public void test01() {
		int[] x = new int[6];
		int i = 0;
		Random random = new Random();
		int sum = 0;
		while (i < 6) {
			int temp = 2 + (int) (Math.random() * 30);
			// int temp = 2 + random.nextInt(30);
			if (temp % 2 != 0) {
				continue;
			}
			x[i] = temp;
			System.out.print(x[i] + "\t");
			sum += x[i];
			i++;
		}
		System.out.println("\n" + sum);
	}

	@Test
	public void test02() {
		DecimalFormat df = new DecimalFormat("#.#####");
		System.out.println(df.format(Math.PI * Math.pow(6, 2)));
	}

	@Test
	public void test03() {
		double x = 2d / 3d;
		System.out.println(x);
		BigDecimal bd01 = new BigDecimal(2);
		BigDecimal bd02 = new BigDecimal(3);
		System.out.println(bd01.divide(bd02, 5, BigDecimal.ROUND_DOWN));
	}

}
