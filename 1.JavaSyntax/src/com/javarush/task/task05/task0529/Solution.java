package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = 0;
        while (true) {
            String a = reader.readLine();
            if (a.equals("сумма")) {
                System.out.println(s);
                break;
            }
            else {
                int i = Integer.parseInt(a);
                s = s + i; } } }}