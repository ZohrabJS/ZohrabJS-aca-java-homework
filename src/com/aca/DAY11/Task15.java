package com.aca.DAY11;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numStudents= scanner.nextInt();
        int[] grades=new int[numStudents];
        for (int i = 0; i <numStudents ; i++) {
            System.out.println("Enter the grade for student "+(i+1));
            grades[i]=scanner.nextInt();
        }
        System.out.print("The average is: ");
        System.out.format("%.2f",average(grades));
        System.out.println();
        System.out.println("The minimum is:"+min(grades));
        System.out.println("The maximum is:"+max(grades));

    }
    public static double average(int[] arr){
      double sum=0;
        for (int i = 0; i<arr.length  ; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    public static int  min(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return  min;
    }
    public static int  max(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return  max;
    }
}
