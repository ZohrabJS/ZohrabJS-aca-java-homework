package com.aca;

import java.util.Random;
import java.util.Scanner;

public class DAY8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Task 1
//        System.out.println("Input size");
//        int size= scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i <size ; i++) {
//            arr[i]= random.nextInt(1,100);
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        for (int i = 0; i <size ; i+=2) {
//            System.out.print(arr[i]+ " ");
//        }

        //Task 2
//        System.out.println("Input size");
//        int size= scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i <size ; i++) {
//            arr[i]= random.nextInt(1,100);
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        for (int i = 0; i <size ; i++) {
//            if(arr[i]%2==0) {
//                System.out.print(arr[i] + " ");
//            }
//        }

        //Task 3
//        System.out.println("Input size");
//        int size= scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i <size ; i++) {
//            arr[i]= random.nextInt(-50,50);
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        for (int i = 0; i <size ; i++) {
//            if (arr[i]>0) {
//                System.out.print(arr[i] + " ");
//            }
//        }

        //Task 4
//        System.out.println("Input size");
//        int size= scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i <size ; i++) {
//            arr[i]= random.nextInt(-50,50);
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        boolean num=true;
//        for (int i = 1; i <size ; i++) {
//            for (int j = 0; j < i; j++) {
//                if(arr[j]<arr[i]){
//                    num=true;
//                }else{
//                    num=false;
//                    break;
//                }
//            }
//            if (num) {
//                System.out.println(arr[i]+" ");
//            }
//        }

        //Task 5
//        System.out.println("Input size");
//        int size= scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i <size ; i++) {
//            arr[i]= random.nextInt(-50,50);
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        for (int i =1 ; i <size ; i++) {
//            if(arr[i]>0 && arr[i-1]>0){
//                System.out.println(arr[i-1]+" "+arr[i]);
//                break;
//            }
//        }

        //Task 6
//        System.out.println("Input size");
//        int size= scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i <size ; i++) {
//            arr[i]= random.nextInt(-50,50);
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        int max=arr[0];
//        int index=0;
//        for (int i =1 ; i <size ; i++) {
//            if(max<arr[i]){
//              max=arr[i];
//              index=i;
//            }
//        }
//        System.out.println("The largest is "+max+" index is "+index);

        //Task 7
//        System.out.println("Input size");
//        int size = scanner.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = random.nextInt(-50, 50);
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int min=0;
//        for (int i = 0; i < size; i++) {
//            if (arr[i]>0) {
//                min = arr[i];
//                break;
//            }
//        }
//        for (int i = 0; i < size; i++) {
//            if (arr[i]>0 && min>arr[i]) {
//                min = arr[i];
//            }
//        }
//        System.out.println(min);

        //Task 8
//        System.out.println("Input size");
//        int size= scanner.nextInt();
//        int[] arr=new int[size];
//        int sum=1;
//        for (int i = 0; i <size ; i++) {
//            arr[i]= scanner.nextInt();
//        }
//        for (int i = 1; i <size ; i++) {
//            if(arr[i]>arr[i-1]){
//                sum++;
//            }
//        }
//        System.out.println(sum);


        //Task 9
//        System.out.println("input size");
//        int size= scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i <size ; i++) {
//            arr[i]= scanner.nextInt();
//        }
//        for (int i =size-1; i >=0 ; i--) {
//            System.out.print(arr[i]+" ");
//        }

        //Task 10
//        System.out.println("input size");
//        int size= scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i <size ; i++) {
//            arr[i]= scanner.nextInt();
//        }
//        for (int i =0; i <size-i ; i++) {
//            int a=arr[i];
//            arr[i]=arr[size-i-1];
//            arr[size-i-1]=a;
//        }
//        for (int i = 0; i <size ; i++) {
//            System.out.print(arr[i]+" ");
//        }


        //Task 11
//        System.out.println("input size");
//        int size= scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i <size ; i++) {
//            arr[i]= scanner.nextInt();
//        }
//        for (int i =1; i <size ; i+=2) {
//            int a=arr[i];
//            arr[i]=arr[i-1];
//            arr[i-1]=a;
//        }
//        for (int i = 0; i <size ; i++) {
//            System.out.print(arr[i]+" ");
//        }

        //Task 12
//        System.out.println("input size");
//        int size= scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i <size ; i++) {
//            arr[i]= scanner.nextInt();
//        }
//        int a=arr[size-1];
//        for (int i =size-1; i >0 ; i--) {
//            arr[i]=arr[i-1];
//        }
//        arr[0]=a;
//        for (int i = 0; i <size ; i++) {
//            System.out.print(arr[i]+" ");
//        }

        //Task13
//        System.out.println("input size");
//        int size= scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i <size ; i++) {
//            arr[i]= scanner.nextInt();
//        }
//        int min=arr[0];
//        int max=arr[0];
//        int minIndex=0;
//        int maxIndex=0;
//        for (int i =0; i <size ; i++) {
//            if(min>arr[i]){
//                min=arr[i];
//                minIndex=i;
//            }
//            if(max<arr[i]){
//                max=arr[i];
//                maxIndex=i;
//            }
//        }
//        int c=arr[maxIndex];
//        arr[maxIndex]=arr[minIndex];
//        arr[minIndex]=c;
//        for (int i = 0; i <size ; i++) {
//            System.out.print(arr[i]+" ");
//        }

        //Task 14
//        System.out.println("input size");
//        int size= scanner.nextInt();
//        System.out.println("input index");
//        int index= scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i <size ; i++) {
//            arr[i]= scanner.nextInt();
//        }
//        for (int i =index; i <size-1 ; i++) {
//           arr[i]=arr[i+1];
//        }
//        for (int i = 0; i <size-1 ; i++) {
//            System.out.print(arr[i]+" ");
//        }

        //Task 15
//        System.out.println("input size");
//        int size= scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i <size ; i++) {
//            arr[i]= scanner.nextInt();
//        }
//        for (int i =0; i <size ; i++) {
//            boolean print=true;
//            for (int j = 0; j <size ; j++) {
//                if(arr[i]==arr[j] && i!=j){
//                    print=false;
//                }
//            }
//            if (print){
//                System.out.print(arr[i]+" ");
//            }
//        }

        //Task 16
//        System.out.println("input size");
//        int size= scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i <size ; i++) {
//            arr[i]= scanner.nextInt();
//        }
//        for (int i =0; i <size ; i++) {
//            for (int j = 0; j <size ; j++) {
//                if(arr[i]==0 && arr[j]!=0 && j>i){
//                    int c=arr[j];
//                    arr[j]=arr[i];
//                    arr[i]=c;
//                    break;
//                }
//            }
//
//        }
//        for (int i = 0; i <size ; i++) {
//            System.out.print(arr[i]+" ");
//        }


    }
}
