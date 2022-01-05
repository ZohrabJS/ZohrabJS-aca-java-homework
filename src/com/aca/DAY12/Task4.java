package com.aca.DAY12;

public class Task4 {
    public static void main(String[] args) {
        int[]arr=new int[5];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=i;
        }
       print(arr);
    }
    public static void   print(int[] arr){
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]+"]");
                break;
            }
            System.out.print(arr[i]+",");
        }
    }
    public static void  print(double[] arr){
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]+"]");
                break;
            }
            System.out.print(arr[i]+",");
        }
    }
    public static void  print(float[] arr){
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]+"]");
                break;
            }
            System.out.print(arr[i]+",");
        }
    }
}
