package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nummer = Integer.parseInt(reader.readLine());
        while(nummer>0){
            if(nummer%2==0)
                Solution.even++;
            else
                Solution.odd++;
            nummer/=10;
        }
        System.out.println("Even: "+Solution.even+" Odd: "+Solution.odd);
    }
}
