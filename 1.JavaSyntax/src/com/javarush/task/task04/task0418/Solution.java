package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        int ad = Integer.parseInt(a);
        int bd = Integer.parseInt(b);
        if(ad < bd)
            System.out.print(ad);
        else
            System.out.print(bd);
    }
}