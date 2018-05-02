package chapter08;

import org.junit.Test;

public class TestInteger {

	Integer x = new Integer(3);
	Integer y = new Integer("3");
	String a = "123";
	// 以 int型返回此 Integer对象
	int b = x.intValue();
	// 返回包含在字符串中的数字的等价数值
	int c = Integer.parseInt("456");

	@Test
	public void test01() {
		// a==b：用在基本数据类型，判断内存地址是否相等
		System.out.println(x == y);
		// a.equals(b)：用于引用数据类型，比较两个对象的内容是否相等
		System.out.println(x.equals(y));
		// a.compareTo(b)：用于包装类和
		// String类，按字典顺序比较两个对象，如果两个对象的值相等，返回0；如果a小于b，返回负数；如果a大于b，返回正数
		System.out.println(x.compareTo(y));

		String[] s = { "123", "345", "789" };
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			sum += Integer.parseInt(s[i]);
		}
		System.out.println(sum);
	}

}
