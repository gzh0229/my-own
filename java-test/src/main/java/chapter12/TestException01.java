package chapter12;

public class TestException01 {

	// 异常产生后，如果不做任何处理，程序就会终止
	public static void main(String[] args) {
		// 没有出现异常前，程序正常运行
		System.out.println("hello...");
		try {
			// java.lang.ArithmeticException 算术异常
			System.out.println(3 / 0);
			System.out.println("hi...");
			// java.lang.NumberFormatException 格式化数字异常
			Integer x = new Integer("yes...");
		} catch (Exception e) {
			// 打印异常信息到控制台，包括异常的类型、原因、栈层次以及出现在程序中的位置
			e.printStackTrace();
			// 返回异常的原因，返回值为 String类型
			System.out.println(e.getMessage());
			// 返回异常的类型、原因，等同于 e.toString()
			System.out.println(e);
		} finally { // 完整的异常处理包括 finally语句
			System.out.println("It's over...");
		}
	}

}
