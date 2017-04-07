package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList[] createList() {
        ArrayList< String >[] arr = new ArrayList[3]; arr[0] = new ArrayList<>(); arr[1] = new ArrayList<>(); arr[2] = new ArrayList<>(); arr[0].add("Строчка в массиве1"); arr[1].add("Строчка в массиве2"); arr[2].add("Строчка в массиве3");
        return arr;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}