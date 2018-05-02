package chapter15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.Test;

/*
 * 字节流
 */
public class TestStream02 {

	// 输出流，重复执行会覆盖文件中已有的内容
	@Test
	public void test01() throws Exception {
		// 使用 File类找到一个文件
		File file = new File("E:\\temp\\a.txt");
		// 创建指定文件的输出流，如果文件不存在，会自动创建文件
		FileOutputStream out = new FileOutputStream(file);
		String str = "曾梦想仗剑走天涯，";
		byte[] b = str.getBytes();
		// 将字节数组长度的字节写入输出流
		out.write(b);
		// 将指定长度范围的数组字节写入输出流
		// out.write(b, 3, 3);
		out.close();
	}

	// 输出流，在文件中追加内容
	@Test
	public void test02() throws Exception {
		File file = new File("E:\\temp\\a.txt");
		// 追加内容的输出流，true表示追加
		FileOutputStream out = new FileOutputStream(file, true);
		// 换行符：在字符串要换行处添加“\r\n”
		String str = "\r\n看一看世界的繁华。";
		byte[] b = str.getBytes();
		out.write(b);
		out.close();
	}

	// 输入流
	@Test
	public void test03() throws Exception {
		// 实例化一个 File对象，指向路径所指文件
		File file = new File("E:" + File.separator + "temp" + File.separator + "a.txt");
		// 创建文件的输入流对象
		FileInputStream input = new FileInputStream(file);
		int len = (int) file.length();
		byte[] b = new byte[len];
		// 从输入流中读取数组长度的字节数据到数组中，返回实际读取到内存中的长度
		input.read(b);
		System.out.println(new String(b));
		input.close();
	}

	// 输入流
	@Test
	public void test04() throws Exception {
		File file = new File("E:" + File.separator + "temp" + File.separator + "a.txt");
		FileInputStream input = new FileInputStream(file);
		int len = (int) file.length();
		byte[] b = new byte[len];
		// 从输入流中一次读取一个字节数据，返回下一个字节数据
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) input.read();
		}
		System.out.println(new String(b));
		input.close();
	}

}
