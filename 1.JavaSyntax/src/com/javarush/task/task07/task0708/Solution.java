package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        for (int i=0;i<5;i++){
            String s = reader.readLine();
            list.add(s);
            if (s.length() > max) {
                //ищем самую длинную строку в списке
                max = s.length();
            }
        }

        for (int i = 0; i < 5; i++) {
            String s = list.get(i);
            if (s.length() == max) {
                System.out.println(s);
            }
        }
    }
}
