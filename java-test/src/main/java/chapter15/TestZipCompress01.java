package chapter15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.junit.Test;

/*
 * 压缩输出流
 */
public class TestZipCompress01 {

	/*
	 * 单个文件压缩
	 */
	@Test
	public void testZipOutput01() throws Exception {
		File file = new File("E:" + File.separator + "temp" + File.separator + "a.txt");
		File zipFile = new File("E:" + File.separator + "temp" + File.separator + "a.zip");
		// 字节输入流对象
		InputStream input = new FileInputStream(file);
		// 压缩文件输出流
		ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
		// 设置压缩文件内的子文件入口
		zipOut.putNextEntry(new ZipEntry(file.getName()));
		int b = 0;
		while ((b = input.read()) != -1) {
			zipOut.write(b);
		}
		input.close();
		zipOut.close();
	}

	/*
	 * 同个文件夹多个文件压缩
	 */
	@Test
	public void testZipOutput02() throws Exception {
		File file = new File("E:" + File.separator + "temp");
		File zipFile = new File("E:" + File.separator + "all.zip");
		InputStream input = null;
		ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				input = new FileInputStream(f);
				String name = file.getName() + File.separator + f.getName();
				zipOut.putNextEntry(new ZipEntry(name));
				int b = 0;
				while ((b = input.read()) != -1) {
					zipOut.write(b);
				}
			}
		}
		input.close();
		zipOut.close();
	}

}
