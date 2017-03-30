package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> allList = new ArrayList<>();
        ArrayList<Integer> mod3List = new ArrayList<>();
        ArrayList<Integer> mod2List = new ArrayList<>();
        ArrayList<Integer> otherList = new ArrayList<>();


        for(int i =0; i<20; i++){
            allList.add(Integer.parseInt(reader.readLine()));
        }

        for(int i=0; i<allList.size();i++ ){

            if(allList.get(i)%3==0){mod3List.add(allList.get(i));}
            if(allList.get(i)%2==0){mod2List.add(allList.get(i));}
            if(allList.get(i)%3!=0 && allList.get(i)%2!=0){otherList.add(allList.get(i));}
        }

        printList(mod3List);
        printList(mod2List);
        printList(otherList);
    }

    public static void printList(List<Integer> list) {
        for(int i=0; i< list.size(); i++)
            System.out.println(list.get(i));
    }
}