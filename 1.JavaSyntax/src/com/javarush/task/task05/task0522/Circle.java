package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x = 0;
    public double y = 0;
    public double radius = 0.1;

    public Circle()
    {

    }

    public Circle(double x)
    {
        this.x = x;
    }

    public Circle(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Circle(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public static void main(String[] args) {

    }
}
