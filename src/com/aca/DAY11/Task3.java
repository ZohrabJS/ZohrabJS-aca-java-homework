package com.aca.DAY11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a");
        boolean a= scanner.nextBoolean();
        System.out.println("Input b");
        boolean b= scanner.nextBoolean();
        System.out.println(xor(a,b));
    }
   public static boolean xor(boolean a, boolean b){
        if (a==true || b==true){
            return true;
        }
        else {
            return false;
        }
   }

}
