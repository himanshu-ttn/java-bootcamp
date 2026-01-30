package com.tothenew.java8.ques10;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZoneDemo {

    public static void main(String[] args) {

        ZonedDateTime indiaTime =
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime usTime =
                ZonedDateTime.now(ZoneId.of("America/New_York"));

        ZonedDateTime ukTime =
                ZonedDateTime.now(ZoneId.of("Europe/London"));

        System.out.println("India Time   : " + indiaTime);
        System.out.println("USA Time     : " + usTime);
        System.out.println("UK Time      : " + ukTime);
    }
}
