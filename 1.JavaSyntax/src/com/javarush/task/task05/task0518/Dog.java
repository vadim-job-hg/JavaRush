package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
*/


public class Dog {
    String name;
    String color;
    int height;
    public Dog(String name){
        this.name=name;

    }

    public Dog(String name,int height) {
        this.name = name;
        this.height = height;

//напишите тут ваш код
    }
    public Dog(String name,int height,String color) {
        this.name = name;
        this.height = height;
        this.color = color;
//напишите тут ваш код
    }
    public static void main(String[] args) {

    }
}