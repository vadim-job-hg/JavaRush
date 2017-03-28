package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int ad = Integer.parseInt(a);
        int bd = Integer.parseInt(b);
        int cd = Integer.parseInt(c);
        if(ad+bd>cd && ad+cd>bd && cd+bd>ad)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}