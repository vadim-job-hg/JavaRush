package com.javarush.task.task07.task0723;

/*
Обратный отсчёт
*/
public class Solution { public static void main(String[] args) throws InterruptedException { for (int i=30;i>=0;i--) { System.out.println(i); try { for (int j = 0; j < 10; j++) { Thread.sleep(100); } } catch (InterruptedException ie) { throw ie; } } System.out.println("Бум!"); } }