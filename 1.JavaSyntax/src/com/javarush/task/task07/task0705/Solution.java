package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[20];
        int[] min1 = new int[10];
        int[] min2 = new int[10];
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
        {
            numbers[i] = Integer.parseInt(bis.readLine());
        }
        for (int i = 0; i < 10; i++)
        {
            min1[i] = numbers[i];
            min2[i] = numbers[10+i];
            System.out.println(min2[i]);
        }
    }
}
