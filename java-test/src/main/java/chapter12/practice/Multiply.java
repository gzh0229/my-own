package chapter12.practice;

public class Multiply {

	public static int test01(int x, int y) throws Exception {
		return x * y;
	}

	public static void main(String[] args) {
		try {
			System.out.println(Multiply.test01(123456789, 987654321));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
