package com.aca.DAY14;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input str");
        String str=scanner.nextLine();
        System.out.println(asterisk(str,0));
    }
    public static String asterisk(String str,int length){
        if(length==str.length()-1){
            return str.charAt(length)+"";
        }
        return str.charAt(length)+"*"+asterisk(str,length+1);
    }
}
