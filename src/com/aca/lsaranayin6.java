package com.aca;

public class lsaranayin6 {
    public static void main(String[] args) {
//        writeVertical(123);
        System.out.println(factorial(5));
        System.out.println(sum(5));
        System.out.println(sumi(123456));
        System.out.println(search(4578457));
        System.out.println(power(2,5));
        System.out.println(fib(10));
    }
//    public static void writeVertical(int n){
//        if (n<10){
//            System.out.println(n);
//        }
//        else{
//            writeVertical(n/10);
//            System.out.println(n%10);
//        }
//    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static int sumi(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumi(n/10);
    }
    public static int search(int n){
        if(n==0){
            return 0;
        }
        if(n%10==7){
            return 1+search(n/10);
        }
        return  search(n/10);
    }
    public static void reverseArray(int[] data,int low,int high){
        if (low<high){
            int temp=data[low];
            data[low]=data[high];
            data[high]=temp;
            reverseArray(data,low+1,high-1);
        }
    }
    public static int power(int x,int n){
        if (n==0){
            return 1;
        }
        return x*power(x,n-1);
    }

    public static int fib(int n){
        if (n<=1)
            return n;
        return fib(n-2)+fib(n-1);
    }
}
