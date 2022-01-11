package com.aca.DAY13;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input str");
        String str=scanner.nextLine();
        System.out.println(duplicate(str));
    }
    public static int duplicate(String str){
        String str2="";
        for (int i = 0; i <str.length() ; i++) {
            boolean one=false;
            for (int j = i+1; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j)){
                    one=true;
                }
            }
            if (one){
                boolean too=true;
                for (int j = 0; j < str2.length(); j++) {
                    if (str.charAt(i)==str2.charAt(j)){
                         too=false;
                    }
                }
                if(too){
                    str2+=str.charAt(i);
                }
            }
        }
        return str2.length();
    }
}
