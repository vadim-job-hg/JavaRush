package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Human grf1 = new Human("grf1", true, 80);
        Human grf2 = new Human("grf2", true, 80);
        Human grm1 = new Human("grm1", false, 80);
        Human grm2 = new Human("grm2", false, 80);
        Human m = new Human("m", true, 40);
        Human w = new Human("w", false, 40);
        Human ch1 = new Human("ch1", true, 10);
        Human ch2 = new Human("ch2", false, 20);
        Human ch3 = new Human("ch3", false, 15);
        m.children.add(ch1);
        m.children.add(ch2);
        m.children.add(ch3);
        w.children.add(ch1);
        w.children.add(ch2);
        w.children.add(ch3);
        grf1.children.add(m);
        grm1.children.add(m);
        grf2.children.add(w);
        grm2.children.add(w);
        System.out.println(grf1);
        System.out.println(grm1);
        System.out.println(grf2);
        System.out.println(grm2);
        System.out.println(m);
        System.out.println(w);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
