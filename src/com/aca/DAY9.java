package com.aca;

import java.util.Scanner;

public class DAY9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Task 1
//        System.out.println("Input size");
//        int n=scanner.nextInt();
//        int[][] arr=new int[n][n];
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j <n ; j++) {
//                if (j==n-i-1){
//                    arr[i][j]=1;
//                }
//                else{
//                    arr[i][j]=0;
//                }
//            }
//        }
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j <n ; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        //Task 2
//        System.out.println("Input size");
//        int n=scanner.nextInt();
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (j == n - i - 1) {
//                    arr[i][j] = 1;
//                } else if(i+j<n) {
//                    arr[i][j] = 0;
//                }
//                else{
//                    arr[i][j]=2;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        //Task 3
        System.out.println("Input size");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        boolean symmetric=true;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if()
            }

        }


    }
}
