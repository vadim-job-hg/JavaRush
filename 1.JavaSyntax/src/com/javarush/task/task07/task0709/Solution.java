package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = 9999999;
        for (int i=0;i<5;i++){
            String s = reader.readLine();
            list.add(s);
            if (s.length() < min) {
                //ищем самую длинную строку в списке
                min = s.length();
            }
        }

        for (int i = 0; i < 5; i++) {
            String s = list.get(i);
            if (s.length() == min) {
                System.out.println(s);
            }
        }
    }
}
