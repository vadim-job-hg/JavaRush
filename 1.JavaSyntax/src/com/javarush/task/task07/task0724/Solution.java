package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandFatherT = new Human ("Kostya", true, 60);
        Human grandFatherS = new Human ("Uara", true, 60);
        Human grandMotherT = new Human ("Vera", false, 60);
        Human grandMotherS = new Human ("Verak", false, 60);
        Human father = new Human ("Sergey", true, 38, grandFatherS,grandMotherS);
        Human mother = new Human ("Nadya", false, 39, grandFatherT,grandMotherT);
        Human son = new Human("Danila", true, 12, father, mother);
        Human daughter = new Human("Sofya", false, 6, father, mother);
        Human son2 = new Human("Ilya", true, 1, father, mother);
        System.out.println(grandFatherT.toString());
        System.out.println(grandFatherS.toString());
        System.out.println(grandMotherT.toString());
        System.out.println(grandMotherS.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son.toString());
        System.out.println(daughter.toString());
        System.out.println(son2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















