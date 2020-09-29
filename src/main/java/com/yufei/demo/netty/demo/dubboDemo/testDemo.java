package com.yufei.demo.netty.demo.dubboDemo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author: sunyufei
 * @Date: 2020/9/21 4:56 下午
 * @Desc:
 */
public class testDemo {
    public static void main(String[] args) {
        String s = "2e114b5c688f9495ca7423707d5eb84ae8fae2f0fee52704e556f3d6f35b3918";
        System.out.println(s.length());

        Long time = 1600766148435L;
        Date date = new Date(time);
        System.out.println(date);
        System.out.println(System.currentTimeMillis());


        LocalDate beginDateTime = LocalDate.parse("2020-09-28 19:00:01", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("--"+beginDateTime);


        LocalDateTime today_start = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        System.out.println(today_start);


        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
        ZonedDateTime zdt = localDateTime.atZone(zoneId);

        Date date1 = Date.from(zdt.toInstant());

        System.out.println("LocalDateTime = " + localDateTime);
        System.out.println("Date = " + date1);


        System.out.println(Date.from(LocalDateTime.of(LocalDate.now(), LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant()));
        System.out.println(Date.from(LocalDateTime.of(LocalDate.now(), LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant()));
    }
}
