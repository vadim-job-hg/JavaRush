package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if(month>=11 || month<=2)
            System.out.ln("Зима");
        else if(month<=5)
            System.out.ln("Весна");
        else if(month<=9)
            System.out.ln("Лето");
        else
            System.out.ln("Осень");
    }
}