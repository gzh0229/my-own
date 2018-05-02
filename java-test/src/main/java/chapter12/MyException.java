package chapter12;

/*
 * 自定义异常
 */
public class MyException extends Exception {

	public MyException() {
		super("参数不能小于0");
	}

	public MyException(String message) {
		// message是要输出的错误信息
		super(message);
	}

}
