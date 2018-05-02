package chapter18;

import org.junit.Test;

/*
 * 通过继承 Thread类创建线程类
 */
public class TestThread01 extends Thread {

	// 线程代码
	public void run() {
		System.out.println(this.getName());
	}

	@Test
	public void test01() {
		// 获取当前线程名
		System.out.println(Thread.currentThread().getName());
		TestThread01 t01 = new TestThread01();
		TestThread01 t02 = new TestThread01();
		// 设置线程名
		t02.setName("t02...");
		// 开启线程
		t01.start();
		t02.start();
	}

}
