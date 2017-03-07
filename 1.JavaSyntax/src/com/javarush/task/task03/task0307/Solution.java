package com.javarush.task.task03.task0307;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();
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
        Protos protos1 = new Protos();
        Protos protos2 = new Protos();
        Protos protos3 = new Protos();
        Protos protos4 = new Protos();
        Protos protos5 = new Protos();
        protos1.name = "z1";
        protos2.name = "z2";
        protos3.name = "z3";
        protos4.name = "z4";
        protos5.name = "z5";
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
