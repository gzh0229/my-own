package chapter10;

public class TestExtend02 extends TestExtend01 {

	public TestExtend02() {
		System.out.println("TestExtend02");
	}

	/*
	 * 重写父类方法可以修改方法的访问修饰符，但权限只能从小范围到大范围改变，test02()父类方法的访问权限为 protected，子类的权限可以是
	 * protected，也可以是 public
	 */
	@Override
	public void test02() {
	}

	/*
	 * 重写父类方法可以修改方法的返回值类型，但必须是父类方法返回值类型的子类 ，test03()父类方法的返回值类型为
	 * TestExtend01，子类的返回值类型可以是 TestExtend01，也可以是 TestExtend02
	 */
	@Override
	public TestExtend02 test03(String str) {
		return this;
	}

}
