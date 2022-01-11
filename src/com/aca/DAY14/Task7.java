package com.aca.DAY14;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input str");
        String str=scanner.nextLine();
        System.out.println(deleteX(str, 0));
    }
    public static String deleteX(String str,int size){
        if(size==str.length()){
            return "";
        }
        if(str.charAt(size)!='x'){
            return str.substring(size,size+1)+deleteX(str,size+1);
        }
        return deleteX(str,size+1);
    }
}
