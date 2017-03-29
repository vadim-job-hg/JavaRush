package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] numbers = new int[20];
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = Integer.parseInt(bis.readLine());
        }
        return numbers;
    }

    public static int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++)
        {
            if(max<array[i]) max = array[i];
        }
        return max;
    }
}
