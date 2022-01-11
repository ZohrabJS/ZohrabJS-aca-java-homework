package com.aca.DAY14;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input str");
        String str=scanner.nextLine();
        System.out.println(endX(str, 0));
    }
    public static String endX(String str,int size){
        if(size==str.length()){
            return"";
        }
       if (str.charAt(size)!='x'){
           return str.charAt(size)+endX(str,size+1);
       }
       return  endX(str,size+1)+str.charAt(size);
    }
}
