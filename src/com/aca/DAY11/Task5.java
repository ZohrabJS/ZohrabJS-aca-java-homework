package com.aca.DAY11;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input n");
        int n= scanner.nextInt();
        System.out.println(prime(n));
    }
    public static boolean prime(int n){
        for (int i = 2; i <n ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
