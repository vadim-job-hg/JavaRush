package com.javarush.task.task02.lesson05;

/* 19
Закоментарь максимальное количество строк, чтобы на экран вывелось число 19
*/
public class Solution
{
    public static void main(String[] args)
    {
        int x = 1;
        int y = 0;

        y = y + x;//1

        x = x * 2;//2
        y = y + x;//3

        x = x * 2;//4
        //y = y + x;//7

        x = x * 2;//8
        //y = y + x;//15

        x = x * 2;//16
        y = y + x;

        System.out.println(y);
    }
}
