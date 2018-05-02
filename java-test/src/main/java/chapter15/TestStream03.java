package chapter15;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

/*
 * 字符流
 */
public class TestStream03 {

	/*
	 * 输出流
	 */
	@Test
	public void test01() throws Exception {
		File file = new File("E:" + File.separator + "temp" + File.separator + "a.txt");
		FileWriter writer = new FileWriter(file);
		String str = "曾梦想仗剑走天涯，";
		writer.write(str);
		writer.close();
	}

	/*
	 * 输出流，追加内容
	 */
	@Test
	public void test02() throws Exception {
		File file = new File("E:" + File.separator + "temp" + File.separator + "a.txt");
		FileWriter writer = new FileWriter(file, true);
		String str = "\r\n看一看世界的繁华。\r\n许巍";
		writer.write(str);
		writer.close();
	}

	/*
	 * 输入流
	 */
	@Test
	public void test03() throws Exception {
		File file = new File("E:" + File.separator + "temp" + File.separator + "a.txt");
		FileReader reader = new FileReader(file);
		char[] c = new char[1024];
		int len = reader.read(c);
		System.out.println(new String(c, 0, len));
		reader.close();
	}

}
