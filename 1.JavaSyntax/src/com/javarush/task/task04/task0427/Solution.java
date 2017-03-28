package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        String s="";
        if((a>=1)&&(a<=999))
        {
            if (a % 2 == 0)
            {
                s = "четное";
            }
            else
            {
                s = "нечетное";
            }
            switch (Integer.toString(a).length())
            {
                case 1:
                    s=s+" однозначное число";
                    break;
                case 2:
                    s=s+" двузначное число";
                    break;
                default:
                    s=s+" трехзначное число";
                    break;
            }
            System.out.println(s);
        }


    }
}
