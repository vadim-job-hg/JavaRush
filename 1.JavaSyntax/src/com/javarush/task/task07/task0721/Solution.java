package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution { public static void main(String[] args) throws IOException { BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); int maximum = 0; int minimum = 0; int[] ints = new int[20]; for (int i = 0; i < ints.length; i++) { ints[i] = Integer.parseInt(reader.readLine()); if (i == 0){ maximum = ints[i]; minimum = ints[i]; } else { if (ints[i] > maximum) maximum = ints[i]; if (ints[i] < minimum) minimum = ints[i]; } } System.out.println(maximum + " " + minimum); } }