package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char[] chArray = str.toCharArray();
        ArrayList< Character > list1 = new ArrayList< Character >();
        ArrayList< Character > list2 = new ArrayList< Character >();
        for (int i = 0; i < chArray.length; i++) { if (isVowel(chArray[ i ])) {
            list1.add(chArray[ i ]); } else if (chArray[ i ] != ' ') { list2.add(chArray[ i ]); } } for (int i = 0; i < list1.size(); i++) System.out.print(list1.get(i) + " "); System.out.println(""); for (int i = 0; i < list2.size(); i++) System.out.print(list2.get(i) + " ");
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}