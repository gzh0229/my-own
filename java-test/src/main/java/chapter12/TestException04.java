package chapter12;

/*
 * 多个 catch捕获异常
 */
public class TestException04 {

	public int devide(int x, int y) throws MyException {
		if (y < 0) {
			throw new MyException("除数不能是负数");
		}
		return x / y;
	}

	public static void main(String[] args) {
		TestException04 te = new TestException04();
		try {
			te.devide(3, 0);
		} catch (MyException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) { // Exception是所有异常类的父类，如果在其他 catch前捕获，后面的
								// catch就没有意义了
			e.printStackTrace();
		}
	}

}
