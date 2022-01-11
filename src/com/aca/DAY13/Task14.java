package com.aca.DAY13;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input str");
        String str= scanner.nextLine();
        System.out.println("Input char");
        char ch=scanner.nextLine().charAt(0);
        System.out.println(argument(str,ch));

    }
    public static int argument (String str, char ch){
        int sum=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==ch){
                sum++;
            }
        }
        return sum;
    }

}
