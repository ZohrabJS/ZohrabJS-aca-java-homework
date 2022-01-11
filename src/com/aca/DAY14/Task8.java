package com.aca.DAY14;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input str");
        String str=scanner.nextLine();
        System.out.println(revers(str, str.length()-1));
    }
    public static String revers(String str,int size){
        if(size<0){
            return "";
        }
        return str.charAt(size)+revers(str,size-1);
    }
}
