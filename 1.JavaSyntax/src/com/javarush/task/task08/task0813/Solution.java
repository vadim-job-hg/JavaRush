package com.javarush.task.task08.task0813;

import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        HashSet<String> st =  new HashSet<String>();
        for (int i = 0; i<20; i++)
            st.add("Л"+i);
        return st;
    }

    public static void main(String[] args) {

    }
}
