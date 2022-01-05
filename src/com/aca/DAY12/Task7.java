package com.aca.DAY12;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(max(1,10));
        System.out.println(max(2,7,4));
        System.out.println(max(4,10,3,20));
    }
    public static int max(int a,int b){
        if(a>b){
            return a;
        }
        return b;
    }
    public static int max(int a,int b,int c){
        if (max(a,b)>c){
            return max(a,b);
        }
        return c;
    }
    public static int max(int a,int b,int c,int d){
        if(max(a,b,c)>d){
            return max(a,b,c);
        }
        return d;
    }
}
