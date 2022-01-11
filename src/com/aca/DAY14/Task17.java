package com.aca.DAY14;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input str");
        String str = scanner.nextLine();
        System.out.println(cut(str, 0));
    }

    public static String cut(String str, int length) {
        if (length == str.length() / 2 && length % 2 != 0) {
            return str.charAt(length) + "";
        }
        if (length == str.length() / 2) {
            return "";
        }

        if (str.charAt(length) == str.charAt(str.length() - length - 1)) {

            return cut(str, length + 1);
        }
        return str.charAt(length) + cut(str, length + 1) + str.charAt(str.length() - length - 1);
    }
}
