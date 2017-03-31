package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n,m;
        ArrayList<String> list = new ArrayList<String>();
        n = Integer.parseInt(reader.readLine());
        m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }
        list.addAll(list.subList(0, m));
        list.removeAll(list.subList(0, m));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
