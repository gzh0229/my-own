package chapter15;

import java.io.File;

import org.junit.Test;

/*
 * 文件操作
 */
public class TestFile01 {

	@Test
	public void test01() throws Exception {

		// File(String pathname)，通过给定的路径（包含文件名）字符串来创建一个 File对象
		File file = new File("E:\\temp\\a.txt");

		// File(String parent, String child)，通过父路径和子路径来创建一个 File对象
		File file02 = new File("E:\\temp", "b.txt");
		file02.createNewFile();

		// File(File parent, String child)，通过 parent对象路径和子路径来创建一个 File对象
		File file03 = new File("E:\\temp");
		File file04 = new File(file03, "c.txt");
		file04.createNewFile();
		// 文件重命名
		file04.renameTo(new File("E:\\temp\\d.txt"));

		System.out.println("系统路径分隔符 separator：" + File.separator);
		System.out.println("系统路径分隔符 pathSeparator：" + File.pathSeparator);

		File file05 = new File("E:" + File.separator + "temp");
		if (file05.isDirectory()) {
			// 返回目录下所有的文件，File对象数组
			File[] f = file05.listFiles();
			for (File t : f) {
				System.out.println(t);
			}
			// 返回目录下所有文件的文件名，String数组
			String[] names = file05.list();
			for (String str : names) {
				System.out.println(str);
			}
		}

		File file06 = new File("E:\\temp\\abc");
		// 创建目录
		file06.mkdir();

		// 返回文件是否存在
		boolean exist = file.exists();
		System.out.println("返回文件是否存在:" + exist);
		// 判断文件是否是一个目录（文件夹）
		boolean d = file.isDirectory();
		System.out.println("判断文件是否是一个目录（文件夹）:" + d);
		// 当且仅当指定路径下文件不存在时，创建文件
		boolean cn = file.createNewFile();
		System.out.println("当且仅当指定路径下文件不存在时，创建文件:" + cn);
		// 文件名称
		String name = file.getName();
		System.out.println("获取文件名称:" + name);
		// 文件的父路径
		String parent = file.getParent();
		System.out.println("获取文件的父路径:" + parent);
		// 文件路径
		System.out.println("文件路径" + file.getPath());
		// 文件的绝对路径
		String absolutePath = file.getAbsolutePath();
		System.out.println("文件的绝对路径:" + absolutePath);
		// 测试 toString()方法
		System.out.println("toString()方法" + file);
		// 是否是隐藏文件
		boolean hidden = file.isHidden();
		System.out.println(hidden);
		// 文件是否可读
		boolean read = file.canRead();
		System.out.println(read);
		// 文件是否可写
		boolean write = file.canWrite();
		System.out.println(write);
		// 文件的长度，以字节为单位
		long length = file.length();
		System.out.println(length);

		// 文件的最后修改时间
		long lastModified = file.lastModified();
		System.out.println(lastModified);
		// 删除文件
		// file.delete();
	}

}
