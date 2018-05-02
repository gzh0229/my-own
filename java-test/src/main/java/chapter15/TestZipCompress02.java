package chapter15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.junit.Test;

/*
 * 多级文件目录压缩
 */
public class TestZipCompress02 {

	@Test
	public void test() throws Exception {
		File file = new File("E:" + File.separator + "temp");
		File zipFile = new File("e:" + File.separator + "all.zip");
		ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
		System.out.println("压缩开始...");
		doZip(file, zipOut, file.getName());
		System.out.println("压缩完成...");
		zipOut.close();
	}

	public void doZip(File file, ZipOutputStream zipOut, String base) throws Exception {
		if (file.isDirectory()) {
			File[] fs = file.listFiles();
			if (fs.length == 0) {
				System.out.println(base + File.separator);
				// 空文件夹只用设置入口，参数为：文件名+“\”
				zipOut.putNextEntry(new ZipEntry(base + File.separator));
			}
			for (int i = 0; i < fs.length; i++) {
				// 递归
				doZip(fs[i], zipOut, base + File.separator + fs[i].getName());
			}
		} else {
			System.out.println(base);
			zipOut.putNextEntry(new ZipEntry(base));
			FileInputStream input = new FileInputStream(file);
			int b = 0;
			while ((b = input.read()) != -1) {
				zipOut.write(b);
			}
			input.close();
		}
	}

}
