package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int max = 0; int min = 999999; int maxindex = 0; int minindex = 0;
        ArrayList<String> List = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            List.add(reader.readLine());
            if(List.get(i).length() > max){
                max = List.get(i).length();
                maxindex = i;
            }
            if(List.get(i).length() < min){
                min = List.get(i).length();
                minindex = i;
            }
        }
        if(maxindex < minindex) { System.out.println(List.get(maxindex)); } else {System.out.println(List.get(minindex));}

    }
}
