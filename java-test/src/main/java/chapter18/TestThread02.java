package chapter18;

public class TestThread02 extends Thread {

	private String who;

	public void run() {
		System.out.println(who + ":" + this.getName());
	}

	public TestThread02(String who) {
		super();
		this.who = who;
	}

	public TestThread02(String who, String name) {
		super(name);
		this.who = who;
	}

	public static void main(String[] args) {
		TestThread02 t01 = new TestThread02("t01", "myThread");
		TestThread02 t02 = new TestThread02("t02");
		TestThread02 t03 = new TestThread02("t03");
		t02.setName("t02...");
		t01.start();
		t02.start();
		t03.start();
	}

}
