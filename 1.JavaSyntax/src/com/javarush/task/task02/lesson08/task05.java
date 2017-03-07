package com.javarush.task.task02.lesson08;

/* Дублирование строки
Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.
*/
public class Solution
{
    public static void print3(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);

    }

    public static void main(String[] args)
    {
        print3("I love you!");
    }
}