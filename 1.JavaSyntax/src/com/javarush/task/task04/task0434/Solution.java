package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 0;
        while (a++ < 10) {
            int b = 0;
            while (b++ < 10) {
                System.out.print(a * b + " ");
            }
            System.out.println("");

        }
    }
}
