package chapter06;

import java.util.Arrays;

import org.junit.Test;

public class TestBinarySearch {

	@Test
	public void test01() {
		int[] x = { 4, 2, 8, 5, 9 };
		// 如果 key 包含在数组中，则返回搜索值的索引，否则返回一个负数（插入点）
		// 在调用搜索方法前，必须对数组进行排序，否则结果会是不确定的；
		// 如果数组包含多个带有指定值的元素，则无法保证找到的是哪一个
		Arrays.sort(x);
		int a = Arrays.binarySearch(x, 5);
		System.out.println(a);
		int b = Arrays.binarySearch(x, 6);
		System.out.println(b);
		// 在指定索引范围内搜索
		int c = Arrays.binarySearch(x, 0, 3, 5);
		System.out.println(c);
		int d = Arrays.binarySearch(x, 0, 3, 8);
		System.out.println(d);
	}

}
