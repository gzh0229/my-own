package chapter11.practice;

public class Test03 {

	static class Test03InnerClass {
		public void doIt() {
			System.out.println(".....");
		}
	}

	public static void main(String[] args) {
		Test03InnerClass tic = new Test03InnerClass();
		tic.doIt();
	}

}
