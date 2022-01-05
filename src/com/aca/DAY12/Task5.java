package com.aca.DAY12;

public class Task5 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        for (int i = 0; i <arr.length ; i++) {
            arr [i]=i;
        }
        System.out.println(search(arr));
        System.out.println(search(arr,3));
        System.out.println(search(arr,2,2));

    }

    public static int search(int[] array) {
        return array.length;
    }

    public static int search(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public static boolean search(int[] array, int argument, int index) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == argument && i == index) {
                return true;
            }
        }
        return false;
    }
}
