package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[10];
        String[] str = new String[10];
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
            str[i] = bis.readLine();
            numbers[i] = str[i].length();
            System.out.println(numbers[i]);
        }
    }
}
