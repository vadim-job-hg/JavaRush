package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> allList = new ArrayList<String>();
        for(int i =0; i<10; i++){
            allList.add(reader.readLine());
        }
        ArrayList<String> result = doubleValues(allList);
        for (String s : result) System.out.println(s);

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for(int i = list.size()-1; i >= 0; i--) list.add(i, list.get(i)); return list;
    }
}
