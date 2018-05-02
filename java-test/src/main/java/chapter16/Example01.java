package chapter16;

public class Example01 {

	String str;
	int a, b, c;

	private Example01() {

	}

	protected Example01(String str, int a) {
		this.str = str;
		this.a = a;
	}

	public Example01(String... strs) throws NumberFormatException {
		if (strs.length > 0) {
			a = Integer.valueOf(strs[0]);
		}
		if (strs.length > 1) {
			b = Integer.valueOf(strs[1]);
		}
		if (strs.length > 2) {
			c = Integer.valueOf(strs[2]);
		}
	}

	public void print() {
		System.out.println("str=" + str);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
	}

}
