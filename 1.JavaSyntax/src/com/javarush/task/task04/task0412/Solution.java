package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d = reader.readLine();
        int nd = Integer.parseInt(d);
        if(nd<0)
            nd++;
        else
            nd*=2;
        System.out.println(nd);
    }

}