package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import org.junit.Test;

public class Test03 {

	@Test
	public void test01() throws Exception {
		File file = new File("E:" + File.separator + "all.zip");
		ZipFile zipFile = new ZipFile(file);
		String base = "E:" + File.separator + "all";
		ZipInputStream zipInput = new ZipInputStream(new FileInputStream(file));
		ZipEntry entry = zipInput.getNextEntry();
		File newFile = new File(base + File.separator + entry.getName());
		FileOutputStream output = new FileOutputStream(newFile);
		InputStream input = zipFile.getInputStream(entry);
		int b = 0;
		while ((b = input.read()) != -1) {
			output.write(b);
		}
		output.close();
		zipInput.close();
		System.out.println("解压完成...");
	}

	@Test
	public void test02() throws Exception {
		File file = new File("E:" + File.separator + "all.zip");
		ZipFile zipFile = new ZipFile(file);
		String base = "E:" + File.separator + "all";
		ZipInputStream zipInput = new ZipInputStream(new FileInputStream(file));
		ZipEntry entry = null;
		test03(entry, base, zipFile, zipInput);
		zipInput.close();
		System.out.println("解压完成...");
	}

	public void test03(ZipEntry entry, String base, ZipFile zipFile, ZipInputStream zipInput) throws Exception {
		while ((entry = zipInput.getNextEntry()) != null) {
			if (entry.isDirectory()) {
				base += File.separator + entry.getName();
				File newFile = new File(base);
				newFile.mkdirs();
				test03(entry, base, zipFile, zipInput);
			}
			FileOutputStream output = new FileOutputStream(base + File.separator + entry.getName());
			InputStream input = zipFile.getInputStream(entry);
			int b = 0;
			while ((b = input.read()) != -1) {
				output.write(b);
			}
			output.close();
		}

	}

	@Test
	public void test04() throws Exception {
		ZipInputStream Zin = new ZipInputStream(new FileInputStream("E:" + File.separator + "all.zip"));
		BufferedInputStream Bin = new BufferedInputStream(Zin);
		String Parent = "E:" + File.separator + "all";
		File Fout = null;
		ZipEntry entry;
		int a = 0;
		while ((entry = Zin.getNextEntry()) != null && !entry.isDirectory()) {
			System.out.println(entry.getName());
			Fout = new File(Parent, entry.getName());
			System.out.println(Fout.exists());
			if (!Fout.exists()) {
				(new File(Fout.getParent())).mkdirs();
				System.out.println(++a);
			}
			FileOutputStream out = new FileOutputStream(Fout);
			BufferedOutputStream Bout = new BufferedOutputStream(out);
			int b;
			while ((b = Bin.read()) != -1) {
				Bout.write(b);
			}
			Bout.close();
			out.close();
		}
		Bin.close();
		Zin.close();
	}

	@Test
	public void test05() {
		File file = new File("E:" + File.separator + "all" + File.separator + "temp" + File.separator + "a.txt");
		System.out.println(file.exists());
	}

}
