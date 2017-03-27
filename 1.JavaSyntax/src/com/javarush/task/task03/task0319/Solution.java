package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge1 = Integer.parseInt(sAge);
        sAge = reader.readLine();
        int nAge2 = Integer.parseInt(sAge);
        System.out.println(name+" получает "+nAge1+" через "+nAge2+" лет.");
    }
}
