package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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
        if(ad == bd && bd == cd)
            System.out.print(ad + " " + bd +" " + cd);
        else if(ad == bd)
            System.out.print(ad + " " + bd);
        else if(bd == cd)
            System.out.print(bd +" " + cd);
        else if(ad == cd)
            System.out.print(ad + " "  + cd);


    }
}