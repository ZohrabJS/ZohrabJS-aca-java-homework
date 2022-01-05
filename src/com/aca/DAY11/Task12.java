package com.aca.DAY11;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input array size");
        int n=scanner.nextInt();
        System.out.println("Input array");
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= scanner.nextInt();
        }
        System.out.println("Input key");
        int key= scanner.nextInt();
        System.out.println(contains(arr,key));
    }
    public static boolean contains(int[] array, int key){
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==key){
                return true;
            }
        }
        return false;
    }
}
