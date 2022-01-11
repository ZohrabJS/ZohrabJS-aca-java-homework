package com.aca.DAY14;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input str");
        String str=scanner.nextLine();
        System.out.println(parentheses(str,0));
    }
    public static String parentheses(String str,int length){
        if(length==str.length()){
            return str;
        }
        if(str.charAt(length)=='(') {
            return parentheses(str,length+1)+")";
        }
            return parentheses(str,length+1)+ str.charAt(length);
    }
}
