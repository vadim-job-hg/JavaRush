package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[15];
        int chet = 0,
            nechet =0;
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++)
        {
            numbers[i] = Integer.parseInt(bis.readLine());
        }

        int SumEven=0; int SumUneven=0; for (int i = 0; i < numbers.length; i++) { if (i % 2 == 0) { SumEven=SumEven+numbers[i]; } else SumUneven=SumUneven+numbers[i]; }
        if(SumEven>SumUneven)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
