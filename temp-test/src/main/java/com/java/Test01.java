package com.java;


import com.alibaba.fastjson.JSONObject;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.Test;

import java.time.ZonedDateTime;
import java.util.*;
import java.util.concurrent.CountDownLatch;

public class Test01 {

    @Test
    public void test01() {
        if (false) {
            return;
        }
        System.out.println("...");
    }


    @Test
    public void test02(){
        Date start = Date.from(ZonedDateTime.now().plusDays(-11).toInstant());
        List<DateRange> partitions = DateUtils.partitionDateByHour(start, new Date(), 2);
        CountDownLatch doneSignal=new CountDownLatch(partitions.size());

            System.out.println(JSONObject.toJSONString(partitions));

    }

    @Test
    public void test03(){
        ZonedDateTime pointCut = ZonedDateTime.now().withHour(16).withMinute(0).withSecond(0);
        Date start = Date.from(pointCut.plusDays(-10).toInstant());
        List<DateRange> partitions = DateUtils.partitionDateByHour(start, new Date(), 1);
        DateRange raiseFullDateRange = new DateRange();
        raiseFullDateRange.setEnd(Date.from(pointCut.toInstant()));
        System.out.println(JSONObject.toJSONString(raiseFullDateRange));
    }

    @Test
    public void test04(){
        System.out.println(Long.parseLong("3,889"));
    }

    @Test
    public static  Date setDateTime(Date date, int hour, int minute, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND,0);
        return calendar.getTime();
    }

    @Test
    public void test05(){
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(JSONObject.toJSONString(now));
    }

}
