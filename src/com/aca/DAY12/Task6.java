package com.aca.DAY12;

import static java.lang.Math.PI;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(square(2));
        System.out.println(square(3.2f));
        System.out.println(square(4,5));
    }
    public static double square(int r){
        return PI*r*r;
    }
    public static int square(int a,int b){
        return a*b;
    }
    public static double square(float a){
        return a*a;
    }
}

