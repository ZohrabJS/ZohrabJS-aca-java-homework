package com.aca.DAY11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        int sum=0;
        do {
            System.out.println("Enter a positive integer (or -1 to end):");
            n= scanner.nextInt();
            if(hasEight(n)){
                sum+=n;
            }
        }while (n!=-1);
        System.out.println("The magic sum is: "+sum);
    }
    public static boolean hasEight(int number){
        while (number>0){
            if(number%10==8){
                return true;
            }
            number/=10;
        }
        return false;
    }
}
