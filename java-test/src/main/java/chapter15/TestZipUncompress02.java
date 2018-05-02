package chapter15;

import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import org.junit.Test;

/*
 * 压缩出入流
 * 未完成
 */
public class TestZipUncompress02 {

	@Test
	public void test01() throws Exception {
		File file = new File("E:" + File.separator + "all.zip");
		ZipFile zipFile = new ZipFile(file);
		String base = "E:" + File.separator + "all";
		ZipInputStream zipInput = new ZipInputStream(new FileInputStream(file));
		ZipEntry entry = null;
		while ((entry = zipInput.getNextEntry()) != null) {
			System.out.println(entry.getName() + "..." + entry.isDirectory());

		}
	}

}
