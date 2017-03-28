package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b || a == c )
            System.out.print(a);
        else if (b == c)
            System.out.print(b);
        else if ((a > b && a < c) || (a < b && a > c))
            System.out.print(a);
        else if ((b > c && b < a) || (b < c && b > a))
            System.out.print(b);
        else
            System.out.print(c);
    }
}
