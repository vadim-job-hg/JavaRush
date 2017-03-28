package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double summ = 0;
        int count = 0;
        double a = 0;
        while (a != -1)
        {
            a = Double.parseDouble(reader.readLine());
            if(a!=-1) {
                summ = summ + a;
                count++;
            }
        }
        System.out.println(summ/count);
    }
}

