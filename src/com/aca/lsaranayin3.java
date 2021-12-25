package com.aca;

import java.util.Random;
import java.util.Scanner;

public class lsaranayin3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task 1 Sarqel 2 cha
//        int[] arr = new int[2];
//        arr[0]=10;
//        arr[1]=20;


        //Task 2 Zangvaci tareri generacia
//           int[] arr=new int[1000] ;
//        for (int i = 0; i < 1000; i++) {
//            arr[i]=i;
//        }


        //Task 3 -20ic 20 mijakayqi kent tveri generacia zangvacum
//        int k=-19;
//        int[] arr=new int[20];
//        for (int i = 0; i < 20; i++) {
//            arr[i]=k;
//            System.out.println(arr[i]);
//            k+=2;
//        }

        //Task 4 zangvaci generaci 5-in bajanvox tverov
//        Random random=new Random();
//        System.out.println("Input size of array");
//        int size=scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i < size;) {
//            int num=random.nextInt(-1000,1000);
//            int n=num%5;
//            if( n == 0)
//            {
//                arr[i]=num;
//                System.out.println(arr[i]);
//                i++;
//            }
//        }


            //Task 5
//        Random random=new Random();
//        System.out.println("Input size of array");
//        int size=scanner.nextInt();
//        double[] arr=new double[size];
//        for (int i = 0; i < size;i++) {
//            double num=random.nextDouble(1000);
//            arr[i]=num;
//        }
//        for (int i = 0; i <size; i++) {
//            if(arr[i]<467.23 && arr[i]>24.12){
//                System.out.println(arr[i]);
//            }
//
//        }


        //Task 6 Zangvaci generacia zuyg tveri indexi tpum
//        Random random=new Random();
//        System.out.println("Input size of array");
//        int size=scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i < size;i++) {
//            arr[i]=random.nextInt(10000);
//        }
//        for (int i = 0; i < size;i++) {
//            if(arr[i]%2==0){
//                System.out.println(i);
//            }
//        }


//        int[][] arr=new int[10][20];
//        for (int i = 0; i < ; i++) {
//            for (int j = 0; j < ; j++) {
//
//            }
//        }

            //Task qarakusi
//        System.out.println("input number");
//        int n=scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <n ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Task achox erankyuni
        System.out.println("input number");
        int n=scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //Task Nvazox erankyuni
//        System.out.println("input number");
//        int n=scanner.nextInt();
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <n ; j++) {
//                if(j<i){
//                    System.out.print(" ");
//                }
//                else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }





















    }
}
