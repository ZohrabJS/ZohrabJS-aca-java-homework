package com.aca.DAY14;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input number");
        int n= scanner.nextInt();
        System.out.println(prime(n,n-1));
    }
    public static String prime(int n,int k){
        if(k==1){
            return "Number is prime";
        }
        if(n%k!=0){
            return prime(n,k-1);
        }
        return "Number is not prime";
    }
}
