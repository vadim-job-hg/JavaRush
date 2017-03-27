package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int n = number;
        int sum = 0, s;
        while(n>0) {
            s = n % 10;
            sum = sum + s;
            n = n/10;
        }
        return sum;
    }
}