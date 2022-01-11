package com.aca.DAY14;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        System.out.println("Input digits");
        String str=scanner.nextLine();
        System.out.println(maxDigit(str,0,str.charAt(0)));
    }
    public static char maxDigit(String str,int length,char max){
        if (length==str.length()){
            return max;
        }
        if(str.charAt(length)>max){
            max=str.charAt(length);
        }
        return maxDigit(str,length+1,max);
    }
}
