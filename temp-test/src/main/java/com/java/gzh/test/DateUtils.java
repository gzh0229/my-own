package com.java.gzh.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtils {

	public static final String short_8_date = "yyyyMMdd";
	public static final String short_10_date = "yyyy-MM-dd";
	public static final String short_12_date = "yyyyMMddHHmm";
	public static final String long_14_date = "yyyyMMddHHmmss";

	public static final DateTimeFormatter DATE_FORMAT =DateTimeFormatter
			.ofPattern("yyyy-MM-dd")
			.withZone(ZoneId.systemDefault());
	
	private DateUtils(){}
	
	/**
	 * 是否合法的日期字符串
	 * @param inDate
	 * @return
	 */
	public static boolean isValidDate(String inDate) {
		if (inDate == null)
			return false;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		if (inDate.trim().length() != dateFormat.toPattern().length())
			return false;
		dateFormat.setLenient(false);
		try {
			dateFormat.parse(inDate.trim());
		} catch (ParseException pe) {
			return false;
		}
		return true;
	}

	public static String format(Date date, String format){
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(date);
	}
	
	public static String format(Date date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(date);
	}
	
	public static String formatLong(Date date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}
	
	public static String parseDate(Date date,String datePattern){
		SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
		return dateFormat.format(date);
	}
	
	public static Date parseDate(String date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return dateFormat.parse(date);
		} catch (ParseException e) {
		}
		return null;
	}
	
	public static Date parseDate(String date,String datePattern){
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
			return dateFormat.parse(date);
		} catch (Exception e) {
		}
		return null;
	}
	
	public static Date parseDateMatch(String date) throws ParseException{
		if(date.length() == 8){
			return parseDate(date, short_8_date);
		}else if(date.length() == 14){
			return parseDate(date, long_14_date);
		}
		return null;
	}
	
	
	/**
	 * 就是这么恶心
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date parseAnyToDate(String date) throws ParseException{
		Calendar c = Calendar.getInstance();
		String dateStr = date;
		if (date.indexOf(" ") > -1) {
			dateStr = date.substring(0,date.indexOf(" "));
		}
		dateStr = dateStr.replaceAll("/", "-");
		String[] dateStrArr =  dateStr.split("-");
		if(dateStrArr.length <3){
			
			return null;
		}
		c.set(Calendar.YEAR, Integer.valueOf(dateStrArr[0]));
		c.set(Calendar.MONTH, Integer.valueOf(dateStrArr[1])-1);
		c.set(Calendar.DATE, Integer.valueOf(dateStrArr[2]));
		return c.getTime();
	}
	
	/**
	 * 获取距离当前日期相应天数的日期
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date dayOffset(Date date, int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, days);
		return calendar.getTime();
	}
	public static Date hourOffset(Date date, int hour) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR_OF_DAY, hour);
		return calendar.getTime();
	}
	/**
	 * 两个日期相隔的天数(date2-date1),支持格式yyyy-MM-dd
	 * @param date1
	 * @param date2
	 * @return date2 - date1
	 * @throws ParseException 
	 */
	public static int diffDay(String date1, String date2) {
		LocalDate localDate1 = LocalDate.parse(date1);
		LocalDate localDate2 = LocalDate.parse(date2);

		Instant instant1 = localDate1.atStartOfDay(ZoneId.systemDefault()).toInstant();

		Instant instant2 = localDate2.atStartOfDay(ZoneId.systemDefault()).toInstant();

		long diffDays = Duration.between(instant1, instant2).toDays();
		return Integer.parseInt(String.valueOf(diffDays));
	}
	
	public static int diffTwoDates(Date date1, Date date2) {

		Instant instant1 = setDateTime(date1, 0, 0, 0).toInstant();
		Instant instant2 = setDateTime(date2, 0, 0, 0).toInstant();
		long between = Duration.between(instant1, instant2).toDays();
		return Integer.parseInt(String.valueOf(between));
	}

	/**
	 * 两个日期相隔的天数(date2-date1),支持格式yyyy-MM-dd
	 * @param date1
	 * @param date2
	 * @return date2 - date1
	 * @throws ParseException
	 */
	public static int diffDay(Date date1, Date date2) {

		Instant instant1 = date1.toInstant();
		Instant instant2 = date2.toInstant();

		long diffDays = Duration.between(instant1, instant2).toDays();
		return Integer.parseInt(String.valueOf(diffDays));
	}

	public static void main(String[] args) {
		int diffDay = diffDay("2018-01-10", LocalDate.now().toString());
		System.out.println(hourOffset(new Date(),-17));
	}

	/**
	 * 获取距离当前日期特定小时，分钟的日期
	 * @param date
	 * @param hour
	 * @param minutes
	 * @return
	 */
	public static Date hourOffset(Date date, int hour , int minutes) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		if (hour != 0) {
			calendar.add(Calendar.HOUR, hour);
		}
		if (minutes != 0) {
			calendar.add(Calendar.MINUTE, minutes);
		}
		return calendar.getTime();
	}

	/**
	 * 设置时分秒
	 * @return
	 * created huaji
     */
	public static  Date setDateTime(Date date, int hour, int minute, int second) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND,999);
		return calendar.getTime();
	}

	/**
	 * 按小时切割日期,每个区间都是前开后闭[...),否则会出现数据重复扫描的情况
	 * @param startDate
	 * @param endDate
	 * @param interval
     * @return
     */
	public static List<DateRange> partitionDateByHour(Date startDate, Date endDate, int interval) {
		List<DateRange> dateRangeList = new ArrayList<>();
		Date nextDate;
		Date beforeDate = startDate;
		while(true) {
			DateRange dateRange = new DateRange();
			nextDate = hourOffset(beforeDate, interval, 0);
			if(nextDate.getTime() >= endDate.getTime()) {
				dateRange.setStart(beforeDate);
				dateRange.setEnd(endDate);
				dateRangeList.add(dateRange);
				break;
			}
			dateRange.setStart(beforeDate);
			dateRange.setEnd(nextDate);
			dateRangeList.add(dateRange);
			beforeDate = nextDate;
		}
		return dateRangeList;
	}

	/**
	 * 按分钟切割日期,每个区间都是前开后闭[...)
	 * @param startDate
	 * @param endDate
	 * @param interval
     * @return
     */
	public static List<DateRange> partitionDateByMinute(Date startDate, Date endDate, int interval) {
		List<DateRange> dateRangeList = new ArrayList<>();
		Date nextDate;
		Date beforeDate = startDate;
		while(true) {
			DateRange dateRange = new DateRange();
			nextDate = hourOffset(beforeDate, 0, interval);
			if(nextDate.getTime() >= endDate.getTime()) {
				dateRange.setStart(beforeDate);
				dateRange.setEnd(endDate);
				dateRangeList.add(dateRange);
				break;
			}
			dateRange.setStart(beforeDate);
			dateRange.setEnd(nextDate);
			dateRangeList.add(dateRange);
			beforeDate = nextDate;
		}
		return dateRangeList;
	}

	public static Date localDateToDate(LocalDate localDate) {
		return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}


	public static String formatDate(Date date) {
		return DATE_FORMAT.format(date.toInstant());
	}
	
	/**
	 * 特需用途
	 * @param date
	 * @return
	 */
	public static Date parseFullTimeDate(String date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return dateFormat.parse(date+" 23:59:59");
		} catch (ParseException e) {
		}
		return null;
	}
}
