package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] numbers = new String[10];
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++)
        {
            numbers[i] = bis.readLine();
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(numbers[numbers.length-i-1]);
        }
    }
}