package com.aca.DAY12;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(reminder(112));
        System.out.println(reminder(145,3));
    }
    public static int reminder(int a){
        int sum=0;
        while (a>0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
    public static int reminder(int a,int b){
        int sum=0;
        while (a>0){
            sum+=a%10;
            a/=10;
        }
        return sum%b;
    }
}
