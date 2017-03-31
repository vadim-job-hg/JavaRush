package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size();i++) {
            int r = 0; int l = 0;
            for (int a = 0; a < list.get(i).length(); a++) {
                if (list.get(i).charAt(a) == 'р') { r++; }
                else if (list.get(i).charAt(a) == 'л') { l++; }
            }
            if (r > 0 && l == 0) {
                list.remove(i); i--;
            } else if (r == 0 && l > 0) { list.add(list.get(i)); i++; } i++; }
        return list;
    }
}