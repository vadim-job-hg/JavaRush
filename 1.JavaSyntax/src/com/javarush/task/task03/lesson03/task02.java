package com.javarush.task.task03.lesson03;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(1, 2));
        System.out.println(convertEurToUsd(3, 4));
    }

    public static double convertEurToUsd(int eur, double course){
        return eur * course;
    }
}
