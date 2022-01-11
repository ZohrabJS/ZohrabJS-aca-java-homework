package com.aca.DAY14;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Input size of array");
        int size =scanner.nextInt();
        int[]arr=new int[size];
        System.out.println("Input natural n for search factorial");
        int n=scanner.nextInt();
        for (int i = 0; i < size; i++) {
            arr[i]=random.nextInt(50);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Sum of array is "+sumArr(arr,size-1));
        System.out.println("Factorial is n "+factorial(n));
    }
    public static int sumArr(int[] arr,int size){
        if(size==0){
            return arr[size];
        }
        return arr[size]+sumArr(arr,size-1);
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
