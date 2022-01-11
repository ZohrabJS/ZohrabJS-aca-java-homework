package com.aca.DAY14;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input number");
        int n=scanner.nextInt();
        System.out.println(search(n));

    }
    public static int search(int n){
        if(n==0){
            return 0;
        }
        if(n%10==7){
            return 1+search(n/10);
        }
        return  search(n/10);
    }
}
