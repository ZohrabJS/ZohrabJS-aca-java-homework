package com.aca;

import java.util.Random;
import java.util.Scanner;

public class bablsort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input size");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        Random random=new Random();
        for (int i = 0; i <size ; i++) {
            arr[i]=random.nextInt(30);
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr);
    }
    public static void bubbleSort(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
