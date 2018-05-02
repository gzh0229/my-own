package chapter07;

public class Practice04 {

	public void test01(int x) {
		for (int i = 0; i < x; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Practice04 p = new Practice04();
		p.test01(5);
	}

}
