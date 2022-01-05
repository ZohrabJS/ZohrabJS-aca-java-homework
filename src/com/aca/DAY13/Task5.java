package com.aca.DAY13;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str= scanner.nextLine();
        System.out.print("The reverse of the String "+str+" is ");
        reverseString(str);
    }
    public static void reverseString(String str){
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
