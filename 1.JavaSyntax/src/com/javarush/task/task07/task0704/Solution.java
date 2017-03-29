package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[10];
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= 10; i++)
        {
            numbers[10-i] = Integer.parseInt(bis.readLine());
        }
        for (int i = 0; i < 10; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}

