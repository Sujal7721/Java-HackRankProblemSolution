package com.example.hackerrank;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Project6 {

    public static String name(int year, int month, int day){
        String none = "None";
//        LocalDate firstDay = LocalDate.of(year, month, day);
//        DayOfWeek firstDOW = (DayOfWeek) firstDay.getDayOfWeek();
        if(year <= 3000) {
            LocalDate firstDay = LocalDate.of(year, month, day);
            DayOfWeek firstDOW = (DayOfWeek) firstDay.getDayOfWeek();
            return String.valueOf(firstDOW);
        }
        return none;
    }

    public static <DayOfWeek> void main(String[] args) {
        String s = name(2015,5,8);
        System.out.println(s);


//        LocalDate firstDay = LocalDate.of(2018, 1, 1);
//        DayOfWeek firstDOW = (DayOfWeek) firstDay.getDayOfWeek();
//        System.out.println(firstDOW);
//
//        LocalDate lastDay2 = LocalDate.of(firstDay.getYear(), firstDay.getMonth(), firstDay.lengthOfMonth());
//
//        LocalDate lastDay3 = firstDay.plusDays(firstDay.lengthOfMonth() - firstDay.getDayOfMonth());

    }
}
