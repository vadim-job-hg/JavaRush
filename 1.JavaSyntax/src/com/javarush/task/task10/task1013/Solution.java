package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private
        String name, lastname;
        private boolean sex;
        private int age;
        private int iq;
        private  int rase;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String lastname) {
            this.name = name;
            this.lastname = lastname;
        }

        public Human(String name, String lastname, boolean sex) {
            this.name = name;
            this.lastname = lastname;
            this.sex = sex;
        }

        public Human(String name, String lastname, boolean sex, int age) {
            this.name = name;
            this.lastname = lastname;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, String lastname, boolean sex, int age, int iq) {
            this.name = name;
            this.lastname = lastname;
            this.sex = sex;
            this.age = age;
            this.iq = iq;
        }

        public Human(String name, String lastname, boolean sex, int age, int iq, int rase) {
            this.name = name;
            this.lastname = lastname;
            this.sex = sex;
            this.age = age;
            this.iq = iq;
            this.rase = rase;
        }

        public Human(String name, int rase) {
            this.name = name;
            this.rase = rase;
        }

        public Human(String name, int iq, int rase) {
            this.name = name;
            this.iq = iq;
            this.rase = rase;
        }

        public Human(String name, String lastname, int iq, int rase) {
            this.name = name;
            this.lastname = lastname;
            this.iq = iq;
            this.rase = rase;
        }

        public Human(String name, boolean sex, int age, int iq, int rase) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.iq = iq;
            this.rase = rase;
        }
    }
}
