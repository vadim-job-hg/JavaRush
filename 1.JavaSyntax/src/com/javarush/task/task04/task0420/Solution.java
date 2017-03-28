package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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
        for(int j = 0; j<count; j++)
            for(int i = 0; i<count; i++)
                if(j<i && nums[j]<nums[i]){
                    temp = nums[j];
                    nums[j]=nums[i];
                    nums[i] = temp;
                }
        System.out.print(nums[0]+" "+nums[1]+" "+nums[2]);
    }
}
