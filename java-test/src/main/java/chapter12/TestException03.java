package chapter12;

/*
 * 实现接口方法，并添加向上抛出异常
 */
public class TestException03 implements ExceptionInterface {

	public void test01() throws NegativeArraySizeException {
		int[] x = new int[-1];
	}

	public static void main(String[] args) {
		TestException03 te = new TestException03();
		try {
			te.test01();
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
		}
	}

}
