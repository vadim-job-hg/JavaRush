package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 3;
        int[] nums = new int[count];
        int minus = 0, plus = 0;
        for(int i = 0; i<count; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
            if(nums[i]>0) plus++;
            if(nums[i]<0) minus++;
        }
        System.out.println("количество отрицательных чисел: "+minus);
        System.out.println("количество положительных чисел: "+plus);

    }
}
