package com.aca.DAY14;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input n");
        int n=scanner.nextInt();
        System.out.println(capsul(n));
    }
    public static int capsul(int n){
        if(n==0){
            return 0;
        }
        return 1+capsul(n-1);
    }
}
