package chapter15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import org.junit.Test;

/*
 * 压缩输入流
 */
public class TestZipUncompress01 {

	/*
	 * 解压内含单个文件的压缩文件
	 */
	@Test
	public void test01() throws Exception {
		// 压缩文件（作为普通文件）
		File file = new File("E:" + File.separator + "all.zip");
		// 解压路径
		String base = "E:" + File.separator + "zipout" + File.separator;
		// 压缩文件输入流
		ZipInputStream zipInput = new ZipInputStream(new FileInputStream(file));
		// 压缩文件
		ZipFile zipFile = new ZipFile(file);
		// 获取压缩文件内的下一个入口
		ZipEntry entry = zipInput.getNextEntry();
		// 获取当前入口的入口名，即文件名
		File temp = new File(base + entry.getName());
		OutputStream out = new FileOutputStream(temp);
		// 获取压缩文件内当前入口的输入流
		InputStream input = zipFile.getInputStream(entry);
		int b = 0;
		while ((b = input.read()) != -1) {
			out.write(b);
		}
		input.close();
		out.close();
		zipInput.close();
		System.out.println("解压完成...");
	}

	/*
	 * 解压内含多个文件的压缩文件
	 */
	@Test
	public void test02() throws Exception {
		File file = new File("E:" + File.separator + "all.zip");
		String base = "E:" + File.separator + "all" + File.separator;
		ZipInputStream zipInput = new ZipInputStream(new FileInputStream(file));
		ZipFile zipFile = new ZipFile(file);
		ZipEntry entry = null;
		while ((entry = zipInput.getNextEntry()) != null) {
			File temp = new File(base + entry.getName());
			OutputStream out = new FileOutputStream(temp);
			InputStream input = zipFile.getInputStream(entry);
			int b = 0;
			while ((b = input.read()) != -1) {
				out.write(b);
			}
			input.close();
			out.close();
		}
		zipInput.close();
		System.out.println("解压完成...");
	}

}
