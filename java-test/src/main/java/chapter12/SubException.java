package chapter12;

/*
 * 子类
 */
public class SubException extends SupException {

	// 子类重写父类方法，必须抛出相同的异常、或异常的子类
	// 父类抛出 Exception
	@Override
	public void test01() throws ClassCastException {

	}

	// 父类抛出多个异常时，子类必须抛出相同的异常、或异常的子集
	// 父类抛出 ArithmeticException, ArrayStoreException
	@Override
	public void test02() throws ArithmeticException {

	}

}
