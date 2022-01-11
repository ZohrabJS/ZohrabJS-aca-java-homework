package com.aca.DAY13;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input str");
        String str=scanner.nextLine();
        System.out.println(str+palindrome(str));
    }
    public static String palindrome(String str){
        for (int i = 0; i <str.length()/2 ; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return " is not Palindrome";
            }
        }
        return " is Palindrome";
    }
}
