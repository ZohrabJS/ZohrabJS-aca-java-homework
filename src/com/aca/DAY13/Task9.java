package com.aca.DAY13;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print ("Input binary number ");
        String str= scanner.nextLine();
        System.out.println(str+checkBinStr(str));
    }
    public static String checkBinStr(String str){
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)!='0' && str.charAt(i)!='1'){
                return " is NOT a binary string";
            }
        }
        return " is a binary string";
    }
}
