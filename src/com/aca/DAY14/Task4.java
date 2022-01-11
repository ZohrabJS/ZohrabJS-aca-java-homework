package com.aca.DAY14;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input n");
        int n=scanner.nextInt();
        System.out.println(sumi(n));
    }
    public static int sumi(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumi(n/10);
    }
}
