package com.aca.DAY14;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Input str");
    String str=scanner.nextLine();
    System.out.println(strNum(str,0));
}
    public static String strNum(String str,int length){
        if (length==str.length()){
            return "";
        }
        if(str.charAt(length)>='0'&& str.charAt(length)<='9'){
            return str.charAt(length)+strNum(str,length+1);
        }
        return strNum(str,length+1);
    }
}
