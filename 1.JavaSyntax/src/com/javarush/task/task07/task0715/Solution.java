package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> allList = new ArrayList<>();
        allList.add("мама");
        allList.add("мыла");
        allList.add("раму");
        allList.add(1, "именно");
        allList.add(3, "именно");
        allList.add(5, "именно");
        for(int i=0; i<allList.size();i++ ){
            System.out.println(allList.get(i));
        }
    }
}
