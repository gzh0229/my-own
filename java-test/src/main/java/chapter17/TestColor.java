package chapter17;

import org.junit.Test;

/*
 * 使用枚举值
 */
public class TestColor {

	@Test
	public void test01() {
		// Color c = Color.BLUE;
		System.out.println(Color.BLUE);
		System.out.println("---------------------");
		// 返回一个包括全部枚举值的数组
		Color[] cs = Color.values();
		for (Color color : cs) {
			System.out.println(color);
		}
		System.out.println("---------------------");
		// 枚举类型可在 switch语句中使用
		switch (Color.BLUE) {
		case RED:
			System.out.println("RED...");
			break;
		case BLUE:
			System.out.println("BLUE...");
			break;
		case YELLOW:
			System.out.println("YELLOW...");
			break;
		case GREEN:
			System.out.println("GREEN...");
			break;
		}
	}

}
