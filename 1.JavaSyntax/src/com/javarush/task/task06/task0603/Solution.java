package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat[]=new Cat [50000];
        Dog dog[]=new Dog [50000];
        for (int i = 1; i <= 50000; i++){
            cat[i] = new Cat();
            cat[i]=null;
            dog [i] = new Dog();
            dog[i]=null;
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dog was destroyed");
    }
}
