package com.aca.DAY11;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input character");
        char a=scanner.nextLine().charAt(0);
        System.out.println(isVowel(a));

    }
    public static boolean isVowel(char a){
        if (a=='A' ||a=='a'||a=='E'||a=='e'||a=='I'||a=='i'||a=='O'||a=='o'||a=='U'||a=='u'){
            return true;
        }
        return false;
    }
}
