package chapter05;

import java.util.Date;

import org.junit.Test;

public class TestFormat {

	/*
	 * 格式化日期
	 */
	@Test
	public void test01() {
		Date date = new Date();
		System.out.println("date" + date);
		String year = String.format("%tY", date);
		System.out.println("4位年份：" + year);
		String year2 = String.format("%ty", date);
		System.out.println("2位年份：" + year2);
		String month = String.format("%tm", date);
		System.out.println("月份：" + month);
		String day = String.format("%td", date);
		System.out.println("天（2位数显示：如08）：" + day);
		String day2 = String.format("%tj", date);
		System.out.println("一年中的第几天：" + day2);
		String day3 = String.format("%te", date);
		System.out.println("这个月中的第几天：" + day3);
		String month2 = String.format("%tB", date);
		System.out.println("指定语言环境的月份全称：" + month2);
		// 英文环境会是月份的缩写，如Feb
		String month3 = String.format("%tb", date);
		System.out.println("指定语言环境的月份简称：" + month3);
		String week = String.format("%tA", date);
		System.out.println("指定语言环境的星期全称：" + week);
		// 英文环境会是星期的缩写，如Mon
		String week2 = String.format("%ta", date);
		System.out.println("指定语言环境的星期简称：" + week2);
	}

	/*
	 * 格式化时间
	 */
	@Test
	public void test02() {
		Date date = new Date();
		System.out.println(date);
		String hour = String.format("%tH", date);
		System.out.println("2位数字的 24 小时制的小时（00~23）：" + hour);
		String hour2 = String.format("%tk", date);
		System.out.println("2位数字的 24 小时制的小时（0~23）：" + hour2);
		String hour3 = String.format("%tI", date);
		System.out.println("2位数字的 12 小时制的小时（01~12）：" + hour3);
		String hour4 = String.format("%tl", date);
		System.out.println("2位数字的 12 小时制的小时（1~12）：" + hour4);
		String minute = String.format("%tM", date);
		System.out.println("2位数字的分钟（00~59）：" + minute);
		String second = String.format("%tS", date);
		System.out.println("2位数字的秒数（00~59）：" + second);
		String millisecond = String.format("%tL", date);
		System.out.println("3位数字的毫秒数（000~999）：" + millisecond);
		String microsecond = String.format("%tN", date);
		System.out.println("9位数字的微秒数（000000000~999999999）：" + microsecond);
		String mf = String.format("%tp", date);
		System.out.println("指定语言环境上午或下午：" + mf);
		String GMT_RFC_82_pyl = String.format("%tz", date);
		System.out.println("相对于 GMT RFC 82 格式的数字时区偏移量：" + GMT_RFC_82_pyl);
		String sqsx = String.format("%tZ", date);
		System.out.println("时区缩写形式的字符串：" + sqsx);
		String totalSecond = String.format("%ts", date);
		System.out.println("1970-01-01 00:00:00 到现在经过的秒数：" + totalSecond);
		String totalMillisecond = String.format("%tQ", date);
		System.out.println("1970-01-01 00:00:00 到现在经过的毫秒数：" + totalMillisecond);
	}

	/*
	 * 格式化日期和时间的组合
	 */
	@Test
	public void test03() {
		Date date = new Date();
		System.out.println(date);
		String date2 = String.format("%tc", date);
		System.out.println("全部日期和时间信息：" + date2);
		String F = String.format("%tF", date);
		System.out.println("年-月-日（4位年份）：" + F);
		String D = String.format("%tD", date);
		System.out.println("月/日/年 （2位年份）：" + D);
		String T = String.format("%tT", date);
		System.out.println("时：分：秒（24小时制）：" + T);
		String r = String.format("%tr", date);
		System.out.println("时：分：秒 上午/下午 （12小时制）：" + r);
		String R = String.format("%tR", date);
		System.out.println("时：分（24小时制）：" + R);
	}

	@Test
	public void test04() {
		Date date = new Date();
		String S = String.format("%tS", date);
		do {
			Date date2 = new Date();
			String a = String.format("%tS", date2);
			if (!S.equals(a)) {
				S = a;
				System.out.println(S);
			}
		} while (true);
	}

	/*
	 * 格式化常规类型
	 */
	@Test
	public void test05() {
		// 参数、表达式结果被格式化为boolean类型：%b、%B
		System.out.println(String.format("参数、表达式结果被格式化为boolean类型：%B", 1 > 2));
		// 参数、表达式结果被格式化为String类型：%s、%S
		System.out.println(String.format("参数、表达式结果被格式化为String类型：%S", 4 / 2));
		// 参数、表达式结果被格式化为char类型：%c、%C
		System.out.println(String.format("参数、表达式结果被格式化为char类型：%C", '好'));
		// 参数、表达式结果被格式化为十进制整数：%d
		System.out.println(String.format("参数、表达式结果被格式化为十进制整数：%d", 0X33));
	}

}
