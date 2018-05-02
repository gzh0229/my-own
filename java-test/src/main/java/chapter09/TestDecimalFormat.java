package chapter09;

import java.text.DecimalFormat;

import org.junit.Test;

/*
 * 浮点型数据格式化
 */
public class TestDecimalFormat {

	@Test
	public void test01() {
		// “#”，如果该位不存在数字，则不显示
		String pattern01 = "###,###,###.##";
		// “0”，如果该位不存在数字，则显示0
		String pattern02 = "000,000,000.00";
		// 将数字乘以100，显示为百分数
		String pattern03 = "###.##%";
		String pattern04 = "###.00%";
		// 数字末尾加 kg单位
		String pattern05 = "#.##kg";
		// 在创建对象时设置格式化模板
		DecimalFormat df01 = new DecimalFormat(pattern01);
		DecimalFormat df02 = new DecimalFormat();
		// 调用 applyPattern(String pattern)方法设置格式化模板
		df02.applyPattern(pattern02);
		// 数字位数，小数点前超过模板位数，会自动按规律添加“,”分组分隔符，小数点后超过位数，会自动四舍五入
		System.out.println(df01.format(1234567890.789));
		System.out.println(df01.format(123456.7));
		System.out.println(df02.format(123456.7));
		df02.applyPattern(pattern03);
		System.out.println(df02.format(0.825));
		System.out.println(df02.format(0.00123));
		df02.applyPattern(pattern04);
		System.out.println(df02.format(0.123));
		df02.applyPattern(pattern05);
		System.out.println(df02.format(1200.345));
		DecimalFormat df03 = new DecimalFormat();
		// 设置格式化数字的分组大小
		df03.setGroupingSize(3);
		System.out.println(df03.format(123456789.123456));
	}

}
