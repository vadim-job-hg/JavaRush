package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        System.out.println((day<10 ? "0":"") + day + " " + (month+1<10 ? "0":"") + (month+1) + " " + year);
    }
}