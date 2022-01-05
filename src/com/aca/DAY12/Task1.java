package com.aca.DAY12;

public class Task1 {
    public static void main(String[] args) {
        add(5,6);
        add(5,6f);
        add(5f,6);
    }
    public static void add(int a,int b){
        System.out.println("Number of parameters.");
    }
    public static void add(int a,float b){
        System.out.println("Data types of parameters");
    }
    public static void add(float a,int b){
        System.out.println("Sequence of parameters");
    }
}

