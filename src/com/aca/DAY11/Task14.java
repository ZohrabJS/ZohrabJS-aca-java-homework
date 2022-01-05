package com.aca.DAY11;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input size");
        int n= scanner.nextInt();
        int[] arr=new int[n];
        System.out.println("Input array");
        for (int i = 0; i <n ; i++) {
            arr[i]= scanner.nextInt();
        }
        int[] arr2=copyOf(arr);
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
    public static int[] copyOf(int[] array){
        int[] arrayCopy=new int[array.length];
        for (int i = 0; i <arrayCopy.length ; i++) {
            arrayCopy[i]=array[i];
        }
        return arrayCopy;
    }
}
