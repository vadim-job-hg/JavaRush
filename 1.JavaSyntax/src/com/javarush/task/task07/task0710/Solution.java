package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<10;i++){
            String s = reader.readLine();
            list.add(0, s);
        }
        for (int i = 0; i < 10; i++) {
            String s = list.get(i);
            System.out.println(s);

        }
    }
}
