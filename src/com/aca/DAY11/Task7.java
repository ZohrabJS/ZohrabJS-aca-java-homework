package com.aca.DAY11;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input n");
        int n= scanner.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        for (int i = n-1; i >0 ; i--) {
            n*=i;
        }
        return n;
    }
}
