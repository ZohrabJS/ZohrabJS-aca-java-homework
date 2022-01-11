package com.aca.DAY13;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Binary string:");
        String str=scanner.nextLine();
        System.out.println(bin2Dec(str));
    }
    public static String bin2Dec(String str){
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)!='0' && str.charAt(i)!='1'){
                return "error: invalid binary string "+str;
            }
        }
        int dec=0;
        int a=1;
        for (int i = str.length()-1; i >=0 ; i--) {
            if(str.charAt(i)=='1'){
            dec+=a;
            }
            a*=2;
        }
        return "The equivalent decimal number for binary "+str+" is: "+dec;
    }
}
