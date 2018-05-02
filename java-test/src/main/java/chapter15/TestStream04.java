package chapter15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

/*
 * 带缓存的输入/输出流
 */
public class TestStream04 {

	/*
	 * 输出流
	 */
	@Test
	public void test01() throws Exception {
		File file = new File("E:" + File.separator + "temp" + File.separator + "a.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		String str01 = "曾梦想仗剑走天涯，看一看世界的繁华。";
		// 写入字符串
		// bw.write(str01);
		String[] str02 = { "曾梦想仗剑走天涯，", "看一看世界的繁华。" };
		for (int i = 0; i < str02.length; i++) {
			bw.write(str02[i]);
			// 写入一个行分隔符
			bw.newLine();
		}
		bw.close();
	}

	/*
	 * 输入流
	 */
	@Test
	public void test03() throws Exception {
		File file = new File("E:" + File.separator + "temp" + File.separator + "a.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		// 一次读取一行数据
		String str = br.readLine();
		while (str != null) {
			System.out.println(str);
			str = br.readLine();
		}
		br.close();
	}

}
