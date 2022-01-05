package com.aca.DAY12;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(distance(3,4));
        System.out.println(distance(4,5,7,15));
    }

    public static double distance(int x1, int x2, int x3, int x4) {
        return Math.sqrt((x1-x3)*(x1-x3)+(x2-x4)*(x2-x4));
    }

    public static double distance(int x1, int x2) {
        return  Math.sqrt(x1*x1+x2*x2);
    }
}
