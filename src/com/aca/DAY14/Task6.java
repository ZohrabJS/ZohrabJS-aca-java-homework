package com.aca.DAY14;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input str");
        String str=scanner.nextLine();
        System.out.println(searchX(str, str.length()-1));
    }
    public static int searchX(String str,int size){
        if(size<0){
            return 0;
        }
        if(str.charAt(size)=='x'){
            return 1+searchX(str,size-1);
        }
        return searchX(str,size-1);
    }
}
