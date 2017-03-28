package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        float af = Float.parseFloat(a);
        if(af%5<=3)
            System.out.print("зелёный");
        else if(af%5<=4)
            System.out.print("желтый");
        else
            System.out.print("красный");
    }
}