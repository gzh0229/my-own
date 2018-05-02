package chapter10.practice;

public class TestSubClass extends TestSuperClass {

	public int x = 5;
	public int z = 6;

	public TestSubClass() {
		System.out.println("TestSubClass...");
	}

	@Override
	public void test02() {
		System.out.println("。。。。。");
	}

	public static void main(String[] args) {
		TestSubClass ts = new TestSubClass();
		System.out.println(ts.x);
		System.out.println(ts.y);
		System.out.println(ts.z);
		ts.test01();
		ts.test02();
	}

}
