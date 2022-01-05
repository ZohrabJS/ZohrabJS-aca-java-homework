package com.aca.DAY11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input a");
        double a= scanner.nextDouble();
        System.out.println("Input n");
        int n= scanner.nextInt();
        System.out.println("a to the power of n is "+ power(a,n));
    }
    public static double power(double a,int n){
        double b=a;
        for (int i = 1; i <n; i++) {
            a*=b;
        }
        return a;
    }
}
