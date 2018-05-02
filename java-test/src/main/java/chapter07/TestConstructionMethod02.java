package chapter07;

public class TestConstructionMethod02 {

	public TestConstructionMethod02(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		// 只有在没有定义任何构造方法时，编译器才会在该类中自动创建一个无参构造方法
		// TestConstructionMethod02 tcm = new TestConstructionMethod02();
		TestConstructionMethod02 tcm = new TestConstructionMethod02("hi");
	}

}
