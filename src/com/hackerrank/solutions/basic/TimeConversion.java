package com.hackerrank.solutions.basic;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeConversion {
    
    public static String answer(String s){
        if(s == null|| s.length() != 10) return "";
        String[] split = s.split(":");
        int hour = Integer.parseInt(split[0]);
        String amPm = split[2].substring(2);
        if(amPm.equalsIgnoreCase("PM")){
            if(hour != 12){
                hour = hour + 12;
            }
            if(hour == 24){
                hour = 0;
            }
        }else{
            if(hour == 12){
                hour = 0;
            }
        }
        return (hour < 10 ? "0"+hour : hour)+":"+split[1]+":"+split[2].substring(0, 2);
    }
}
