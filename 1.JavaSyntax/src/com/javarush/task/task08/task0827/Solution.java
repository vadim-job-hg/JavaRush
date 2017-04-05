package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date current = new Date(date); Date newgood = new Date(current.getYear(), 0, 0); Date diff = new Date(current.getTime() - newgood.getTime()); if ((diff.getTime() / 1000) / (86400) % 2 == 0) { return false; } else { return true; }
    }
}
