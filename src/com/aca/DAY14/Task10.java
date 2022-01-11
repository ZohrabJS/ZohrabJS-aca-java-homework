package com.aca.DAY14;

import java.util.Locale;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input str");
        String str=scanner.nextLine();
        System.out.println(stringClean(str,0));
    }
    public static String  stringClean(String str,int start){
        if(start==str.length()-1){
            return str.charAt(start)+"";
        }
        if (str.charAt(start)!=str.charAt(start+1)){
            return str.charAt(start)+stringClean(str,start+1);
        }
        return stringClean(str,start+1);
    }
}
