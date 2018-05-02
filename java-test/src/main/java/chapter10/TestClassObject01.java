package chapter10;

/*
 * 在 Java中，所有类都直接或间接继承了java.lang.Object类，自定义的类也都继承于 Object类；
 * 由于所有类都是 Object的子类，所以在定义类时，省略了 extends Object关键字
 */
public class TestClassObject01 {

	@Override
	public String toString() {
		System.out.println("toString()");
		return getClass().getName();
	}

	public static void main(String[] args) {
		TestClassObject01 tco = new TestClassObject01();
		// 打印对象时，会自动调用类的 toString()方法
		System.out.println(tco);
	}

}
