package chapter12;

import org.junit.Test;

/*
 * 使用自定义异常
 */
public class TestException02 {

	public static int avg(int x, int y) throws MyException {
		if (x < 0 || y < 0) {
			throw new MyException();
		}
		if (x > 100 || y > 100) {
			throw new MyException("参数不能大于100");
		}
		return (x + y) / 2;
	}

	// 向上抛出异常
	public void test01(int x, int y) throws MyException {
		TestException02.avg(x, y);
	}

	// 捕获并处理异常
	public void test02(int x, int y) {
		try {
			TestException02.avg(x, y);
		} catch (MyException e) {
			e.printStackTrace();
		} finally {
			System.out.println("test04()...参数不符合要求");
		}
	}

	@Test
	public void test03() {
		try {
			test01(-1, 1);
		} catch (MyException e) {
			e.printStackTrace();
		} finally {
			System.out.println("test03()...参数不符合要求");
		}
	}

	@Test
	public void test04() {
		test02(1, 101);
	}

}
