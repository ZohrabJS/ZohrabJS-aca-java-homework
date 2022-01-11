package com.aca.DAY13;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print ("Enter a hex string: ");
        String str= scanner.nextLine();
        System.out.println(str+hex(str));
    }
    public static String hex(String str){
        for (int i = 0; i <str.length() ; i++) {
            if(!((str.charAt(i)>='0'&& str.charAt(i)<='9') || (str.charAt(i)>='a' && str.charAt(i)<='f')|| (str.charAt(i)>='A' && str.charAt(i)<='F'))){
                return " is NOT a hex string";
            }
        }
        return " is a hex string";
    }
}
