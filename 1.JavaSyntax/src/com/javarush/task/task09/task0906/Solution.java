package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        String s1 = Thread.currentThread().getStackTrace()[2].getClassName(); String s2 = Thread.currentThread().getStackTrace()[2].getMethodName(); System.out.println(s1 + ": " + s2 + ": " + s);
    }
}
