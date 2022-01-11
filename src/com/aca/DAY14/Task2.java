package com.aca.DAY14;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input n");
        int n=scanner.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if (n<=1)
            return n;
        return fib(n-2)+fib(n-1);
    }
}
