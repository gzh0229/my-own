package chapter11;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		Date date01 = new Date();
		// 在类中已经导入了 com.gzh0229.Date类，再使用其他包中的 Date类时必须使用带包格式的完整类名
		java.util.Date date02 = new java.util.Date();
	}

}
