package chapter10;

public class TestOverLoad01 {

	public void add(int a, int b) {
		System.out.println(0);
	}

	// 仅仅更改返回值类型，不构成方法重载
	// public int add(int a, int b) {
	// System.out.println("int a, int b");
	// return 2;
	// }

	// 方法有两个相同类型的参数，改变顺序，不构成重载
	// public void add(int b, int a) {
	// System.out.println("int b, int a");
	// }

	// 两个方法的参数类型不同，构成重载
	public void add(int a, double b) {
		System.out.println(1);
	}

	// 方法有两个不同类型的参数，改变顺序，构成重载
	public void add(double b, int a) {
		System.out.println(2);
	}

	// 方法的参数个数不同，构成重载
	public void add(int a) {
		System.out.println(3);
	}

	// 不定长参数，其实就是一个数组
	public void add(int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("sum =" + sum);
	}

	public static void main(String[] args) {
		TestOverLoad01 tov = new TestOverLoad01();
		tov.add(1, 2);
		tov.add(1, 2.1);
		tov.add(1.2, 2);
		tov.add(1);
		tov.add(3);
		tov.add(3, 4);
		tov.add(3, 4, 5);
	}

}
