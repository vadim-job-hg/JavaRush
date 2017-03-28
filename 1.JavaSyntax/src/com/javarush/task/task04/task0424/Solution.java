package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 3;
        int[] nums = new int[count];
        int temp;
        for(int i = 0; i<count; i++)
            nums[i] = Integer.parseInt(reader.readLine());
        if(nums[0]!=nums[1] && nums[1]==nums[2])
            System.out.println(1);
        if(nums[1]!=nums[0] && nums[0]==nums[2])
            System.out.println(2);
        if(nums[2]!=nums[1] && nums[1]==nums[0])
            System.out.println(3);
    }
}
