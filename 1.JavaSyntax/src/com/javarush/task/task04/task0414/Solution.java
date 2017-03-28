package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d = reader.readLine();
        int nd = Integer.parseInt(d);
        int dd;
        if(nd%4==0){
            if(nd%100==0 && nd%400!=0)
                dd = 365;
            else
                dd = 366;
        }
        else
            dd = 365;
        System.out.println("количество дней в году: "+dd);
    }
}