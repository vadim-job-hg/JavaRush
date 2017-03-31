package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> allList = new ArrayList<String>();
        int length=0, num=0;
        for(int i =0; i<10; i++){
            allList.add(reader.readLine());
            if(allList.get(i).length()<length && num==0)
                num = i;
            length =   allList.get(i).length();
        }
        if (num>0)
            System.out.println(num);
    }
}

