package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d = reader.readLine();
        int nd = Integer.parseInt(d);
        if(nd==1)
            System.out.print("понедельник");
        else if(nd==2)
            System.out.print("вторник");
        else if(nd==3)
            System.out.print("среда");
        else if(nd==4)
            System.out.print("четверг");
        else if(nd==5)
            System.out.print("пятница");
        else if(nd==6)
            System.out.print("суббота");
        else if(nd==7)
            System.out.print("воскресенье");
        else
            System.out.print("такого дня недели не существует");
    }
}