package com.aca.DAY11;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input number");
        String a= scanner.nextLine();
        System.out.println(palindrome(a));

    }
    public static boolean palindrome(String n){
        for (int i = 0; i <n.length()/2 ; i++) {
            if (n.charAt(i)!= n.charAt(n.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
