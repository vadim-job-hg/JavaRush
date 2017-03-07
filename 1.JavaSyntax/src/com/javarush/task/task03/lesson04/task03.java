package com.javarush.task.task03.lesson04;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = New Zerg();
        Zerg zerg2 = New Zerg();
        Zerg zerg3 = New Zerg();
        Zerg zerg4 = New Zerg();
        Zerg zerg5 = New Zerg();
        Zerg zerg6 = New Zerg();
        Zerg zerg7 = New Zerg();
        Zerg zerg8 = New Zerg();
        Zerg zerg9 = New Zerg();
        Zerg zerg10 = New Zerg();
        zerg1.name = "1";
        zerg2.name = "2";
        zerg3.name = "3";
        zerg4.name = "4";
        zerg5.name = "5";
        zerg6.name = "6";
        zerg7.name = "7";
        zerg8.name = "8";
        zerg9.name = "9";
        zerg10.name = "10";
        Protos zerg1 = new Protos();
        Protos zerg2 = new Protos();
        Protos zerg3 = new Protos();
        Protos zerg4 = new Protos();
        Protos zerg5 = new Protos();
        zerg1.name = "z1";
        zerg2.name = "z2";
        zerg3.name = "z3";
        zerg4.name = "z4";
        zerg5.name = "z5";
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();
        terran1.name = "t11";
        terran2.name = "2t1";
        terran3.name = "t2341";
        terran4.name = "t3243rsdf1";
        terran5.name = "t234s1";
        terran6.name = "tfds1";
        terran7.name = "tsdfds1";
        terran8.name = "t1sdfsd";
        terran9.name = "t1dsfds";
        terran10.name = "tsdf";
        terran12.name = "tsdf1";
        terran11.name = "t1sdf";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}