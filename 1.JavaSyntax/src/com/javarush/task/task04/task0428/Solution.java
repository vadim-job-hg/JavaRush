package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 3;
        int[] nums = new int[count];
        int num = 0;
        for(int i = 0; i<count; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
            if(nums[i]>0) num++;
        }
        System.out.println(num);
    }
}
