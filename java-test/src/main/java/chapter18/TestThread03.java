package chapter18;

/*
 * 通过实现 Runnable接口创建线程类，必须通过 Thread类的实例才能创建线程对象
 */
public class TestThread03 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		TestThread03 t01 = new TestThread03();
		TestThread03 t02 = new TestThread03();
		Thread thread01 = new Thread(t01);
		Thread thread02 = new Thread(t02, "t02...");
		thread01.start();
		thread02.start();
	}

}
