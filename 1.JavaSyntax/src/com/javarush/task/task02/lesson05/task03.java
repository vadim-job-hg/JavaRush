package com.javarush.task.task02.lesson05;

/* У каждого животного должна быть хозяйка.
Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
Присвойте каждому животному владельца (owner).
*/
public class Solution
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        Woman woman=  new Woman();
        dog.owner = woman;
        cat.owner = woman;
        fish.owner = woman;
    }

    public static class Cat
    {
        public Woman owner;
    }

    public static class Dog
    {
        public Woman owner;
    }

    public static class Fish
    {
        public Woman owner;
    }

    public static class Woman
    {
    }
}
