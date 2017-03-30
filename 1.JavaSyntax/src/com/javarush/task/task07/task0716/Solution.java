package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list = fix(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
public static ArrayList fix(ArrayList list) {
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).contains("р") && list.get(i).contains("л")) {
        } else if (list.get(i).contains("л")) {
            list.add(i, list.get(i-1)); } else if (list.get(i).contains("р")) { list.remove(i); } } return list;
}
}

}