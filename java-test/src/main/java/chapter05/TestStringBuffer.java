package chapter05;

import java.util.Date;

import org.junit.Test;

public class TestStringBuffer {

	@Test
	public void test01() {
		// 追加字符序列
		StringBuffer sb = new StringBuffer("好好学习，");
		sb.append("天天向上。");
		int x = 123;
		sb.append(x);
		System.out.println(sb);
	}

	@Test
	public void test02() {
		StringBuffer sb = new StringBuffer("翻过一座山，又见一座山。");
		// 修改指定索引处的字符
		sb.setCharAt(2, '二');
		System.out.println(sb);
	}

	@Test
	public void test03() {
		StringBuffer sb = new StringBuffer("0123456");
		System.out.println(sb);
		// 在指定索引处插入字符
		sb.insert(2, 'A');
		System.out.println(sb);
		char[] x = { 'B', 'C', 'D' };
		// 在指定索引处插入字符数组
		sb.insert(3, x);
		System.out.println(sb);
		// 在指定索引处插入字符串
		sb.insert(6, "EF");
		System.out.println(sb);
	}

	@Test
	public void test04() {
		StringBuffer sb = new StringBuffer("0123456");
		// 字符串反序
		sb.reverse();
		System.out.println(sb);
	}

	@Test
	public void test05() {
		StringBuffer sb = new StringBuffer("天行健，君子以自强不息");
		// 删除子字符串
		sb.delete(4, 7);
		System.out.println(sb);
	}

	@Test
	public void test06() {
		StringBuffer sb = new StringBuffer("春鸟");
		sb.insert(2, "眠不觉晓，处处闻啼");
		System.out.println(sb);

	}

	@Test
	public void test07() {
		StringBuffer sb01 = new StringBuffer("春鸟");
		StringBuffer sb02 = new StringBuffer("春鸟");
		sb01.insert(1, "眠不觉晓，处处闻啼");
		sb02.replace(1, 1, "眠不觉晓，处处闻啼");
		System.out.println(sb01);
		System.out.println(sb02);
	}

	/*
	 * 测试String、StringBuffer、StringBuilder操作字符串的效率
	 */
	@Test
	public void test08() {
		// 返回以毫秒为单位的当前时间
		long starTime = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < 10000; i++) {
			str += i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("String:" + (endTime - starTime));
		starTime = System.currentTimeMillis();
		StringBuffer sbf = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			sbf.append(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer:" + (endTime - starTime));
		starTime = System.currentTimeMillis();
		StringBuilder sbl = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sbl.append(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder:" + (endTime - starTime));

	}
}
