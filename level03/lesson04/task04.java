package com.javarush.test.level03.lesson04.task04;

/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(factorial(10));

    }

    public static int factorial(int number)
    {
        if(number>1)
            return number * factorial(number-1);
        else
            return number;

    }
}