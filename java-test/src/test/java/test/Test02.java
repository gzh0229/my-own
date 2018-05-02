package test;

import java.io.File;

import org.junit.Test;

public class Test02 {

	@Test
	public void test01() {
		File file01 = new File("E:" + File.separator + "temp");
		File file02 = new File("E:" + File.separator + "temp" + File.separator + "a.txt");
		System.out.println(file01.getName());
		System.out.println(file01.length());
		System.out.println(file02.getName());
		System.out.println(file02.length());
	}

}
