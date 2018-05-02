package chapter17;

import org.junit.Test;

/*
 * 使用枚举类型
 */
public class TestSeason {

	@Test
	public void test01() {
		for (Season s : Season.values()) {
			System.out.println(s);
		}
		test02(Season.FALL);
	}

	public void test02(Season s) {
		switch (s) {
		case SPRING:
			System.out.println("SPRING...");
			break;
		case SUMMER:
			System.out.println("SUMMER...");
			break;
		case FALL:
			System.out.println("FALL...");
			break;
		case WINTER:
			System.out.println("WINTER...");
			break;
		}
	}

}
