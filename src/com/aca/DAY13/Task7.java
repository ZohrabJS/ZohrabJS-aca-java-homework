package com.aca.DAY13;

import java.util.Locale;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String str = scanner.nextLine();
        str = str.toUpperCase(Locale.ROOT);
        System.out.print("The ciphertext string is: ");
        System.out.println(caesarCode(str, 3));

    }

    public static String caesarCode(String str, int n) {
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)+n>'Z'){
                newStr+=(char)(str.charAt(i)+n-26);
            }
            else {
                newStr += (char) (str.charAt(i) + n);
            }
        }
        return newStr;
    }
}
