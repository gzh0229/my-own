package chapter07;

public class TestConstructionMethod01 {

	public TestConstructionMethod01() {
		// 可在无参构造方法的第一句使用 this调用有参构造方法
		this("hi");
	}

	public TestConstructionMethod01(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		TestConstructionMethod01 tcm = new TestConstructionMethod01();
	}

}
