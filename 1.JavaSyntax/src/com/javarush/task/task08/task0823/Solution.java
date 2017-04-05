package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder(reader.readLine()); int pos=0,L=s.length(); loop: while (pos < L){ while (s.charAt(pos) == ' ') if (++pos==L) break loop; s.setCharAt(pos,Character.toUpperCase(s.charAt(pos))); while (s.charAt(pos) != ' ') if (++pos==L) break loop; } System.out.println(s);
    }
}
