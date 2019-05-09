package com.java.gzh.test;

import com.alibaba.fastjson.JSONObject;
import org.testng.annotations.Test;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Test01 {

    @org.testng.annotations.Test
    public void test01() {
        if (false) {
            return;
        }
        System.out.println("...");
    }


    @org.testng.annotations.Test
    public void test02() {
        Date start = Date.from(ZonedDateTime.now().plusDays(-11).toInstant());
        List<DateRange> partitions = DateUtils.partitionDateByHour(start, new Date(), 2);
        CountDownLatch doneSignal = new CountDownLatch(partitions.size());

        System.out.println(JSONObject.toJSONString(partitions));

    }

    @org.testng.annotations.Test
    public void test03() {
        ZonedDateTime pointCut = ZonedDateTime.now().withHour(16).withMinute(0).withSecond(0);
        Date start = Date.from(pointCut.plusDays(-10).toInstant());
        List<DateRange> partitions = DateUtils.partitionDateByHour(start, new Date(), 1);
        DateRange raiseFullDateRange = new DateRange();
        raiseFullDateRange.setEnd(Date.from(pointCut.toInstant()));
        System.out.println(JSONObject.toJSONString(raiseFullDateRange));
    }

    @org.testng.annotations.Test
    public void test04() {
        System.out.println(Long.parseLong("3,889"));
    }

    @org.testng.annotations.Test
    public static Date setDateTime(Date date, int hour, int minute, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    @org.testng.annotations.Test
    public void test05() {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(JSONObject.toJSONString(now));
    }

    @org.testng.annotations.Test
    public void test06() {
        System.out.println(String.valueOf(new Date().getTime()));
    }

    @org.testng.annotations.Test
    public void test07() {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println("=====:" + list.get(list.size() - 1));
    }

    @org.testng.annotations.Test
    public void test08() {
        Date startDate = DateUtils.dayOffset(new Date(), -1);
        System.out.println(startDate);
    }

    @org.testng.annotations.Test
    public void test09() {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        int i = 1;
        for (String out : list) {
            for (String inner : list) {
                System.out.println(i + " out:" + out + ",inner:" + inner);
                i++;
            }
        }
    }

    @Test
    public void test10() {
        System.out.println(System.currentTimeMillis());
    }


}
