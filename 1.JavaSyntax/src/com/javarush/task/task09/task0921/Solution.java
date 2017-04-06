package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList< Integer > list = new ArrayList< Integer >(); BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); for (int i = 0; true; i++) { try{ String text = reader.readLine(); try{ int digit = Integer.parseInt(text); list.add(digit); } catch(NumberFormatException e){ for (int j = 0; j < list.size(); j++) System.out.println(list.get(j)); break; } } catch(Exception e){ } }
    }
}
