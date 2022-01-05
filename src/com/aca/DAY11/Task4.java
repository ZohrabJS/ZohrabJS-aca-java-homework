package com.aca.DAY11;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input x");
        boolean x= scanner.nextBoolean();
        System.out.println("Input y");
        boolean y= scanner.nextBoolean();
        System.out.println("Input z");
        boolean z= scanner.nextBoolean();
        System.out.println(election(x,y,z));
    }
    static boolean election(boolean x, boolean y, boolean z) {
        int sum = 0;
        if (x == true) {
            sum++;
        }
        if (y == true) {
            sum++;
        }
        if (z == true) {
            sum++;
        }
        if (sum >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
