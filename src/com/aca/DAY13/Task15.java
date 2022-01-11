package com.aca.DAY13;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input str");
        String str=scanner.nextLine();

        variant(str,"");
    }
    public static void variant(String str,String rez){
        if(str.length()==0){
            System.out.print(rez+" ");
            return;
        }
        for (int i = 0; i <str.length() ; i++) {
            String str2=str.substring(0,i)+str.substring(i+1);
            variant(str2,rez+str.charAt(i));
        }
    }
}
