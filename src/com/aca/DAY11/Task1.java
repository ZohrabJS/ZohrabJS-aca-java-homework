package com.aca.DAY11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        System.out.println("Input c");
        int c = scanner.nextInt();
        System.out.println("Input d");
        int d = scanner.nextInt();
        System.out.println("Minimum is  " + min(a, b, c, d));
    }

   public static int min(int a, int b, int c, int d) {
        if (a < b && a < c && a < d) {
            return a;
        }
        if (b < c && b < d) {
            return b;
        }
        if (c < d) {
            return c;
        } else {
            return d;
        }

    }
}
