package chapter10;

public class TestInterface02 {

	public void add(TestInterface02 t) {
		System.out.println("add()");
	}

	public static void main(String[] args) {
		// 接口没有构造方法，不能实例化对象，但可以声明一个接口的引用变量，让它指向一个实现了接口的类的实例；
		TestInterface01 ti01 = new test01();
		ti01.draw();
		TestInterface01 ti02 = new test02();
		ti02.draw();
	}
}

// 内部类
class test01 extends TestInterface02 implements TestInterface01 {

	@Override
	public void draw() {
		System.out.println("正方形...");
	}

}

// 内部类
class test02 extends TestInterface02 implements TestInterface01 {

	@Override
	public void draw() {
		System.out.println("平行四边形...");
	}

}