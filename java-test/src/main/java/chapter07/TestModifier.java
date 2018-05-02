package chapter07;

public class TestModifier {

	public String name01 = "lili01";
	protected String name02 = "lili02";
	private String name03 = "lili03";

	public void getName01() {
		System.out.println(name01);
		System.out.println(name02);
		System.out.println(name03);
	}

	protected void getName02() {
		System.out.println(name01);
		System.out.println(name02);
		System.out.println(name03);
	}

	private void getName03() {
		System.out.println(name01);
		System.out.println(name02);
		System.out.println(name03);
	}
}