package com.aca.DAY11;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input number");
        int num= scanner.nextInt();
        System.out.println(hasEight(num));
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
