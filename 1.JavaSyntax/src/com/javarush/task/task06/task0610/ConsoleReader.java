package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    //private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String readString() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static int readInt() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    public static double readDouble() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(br.readLine());
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine().equals("true");
    }
}
