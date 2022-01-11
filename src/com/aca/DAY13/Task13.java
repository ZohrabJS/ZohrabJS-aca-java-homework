package com.aca.DAY13;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input str");
        String str=scanner.nextLine();
        System.out.println(duplicate(str));
    }
    public static char duplicate(String str){
        for (int i = 0; i <str.length() ; i++) {
            boolean one=false;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j) && i!=j){
                    one=true;
                }
            }
            if (!one){
                return str.charAt(i);
            }
        }
        return ' ';
    }
}
