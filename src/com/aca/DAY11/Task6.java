package com.aca.DAY11;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input n");
        int n= scanner.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n){
        int a=1;
        int b=1;
        int c=2;
        if (n==0 || n==1){
            return a;
        }
        if (n==2){
            return c;
        }
        for (int i = 0; i <n-2; i++) {
            a=b;
            b=c;
            c=a+b;
        }
        return c;
    }
}
