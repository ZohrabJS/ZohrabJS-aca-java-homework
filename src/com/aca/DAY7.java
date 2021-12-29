package com.aca;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DAY7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task 1
//        System.out.println("Input a");
//        int a =scanner.nextInt();
//        System.out.println("Input b");
//        int b =scanner.nextInt();
//        for ( ; a <=b ; a++) {
//            if (a%2==0){
//                System.out.println(a);
//            }
//        }

        //Task 2
//        System.out.println("Input a");
//        int a =scanner.nextInt();
//        System.out.println("Input b");
//        int b =scanner.nextInt();
//        System.out.println("Input c");
//        int c =scanner.nextInt();
//        System.out.println("Input d");
//        int d =scanner.nextInt();
//        for ( ; a <=b ; a++) {
//            if (a%d==c){
//                System.out.println(a);
//            }
//        }

        //Task 3
//        System.out.println("Input a");
//        int a =scanner.nextInt();
//        System.out.println("Input b");
//        int b =scanner.nextInt();
//        for ( ; a <=b ; a++) {
//            if ( Math.sqrt(a)==(int)Math.sqrt(a)){
//                System.out.println(a);
//            }
//        }

        //Task 4
        //Task 5
//        System.out.println("Input x");
//        int x= scanner.nextInt();
//        int k=0;
//        while (x>0){
//            if(x%10==0 && k==0){
//                x/=10;
//                continue;
//            }
//            System.out.print(x%10);
//            x/=10;
//            k++;
//        }


        //Task 6
//        System.out.println("Input x");
//        int x= scanner.nextInt();
//        for (int i = 2; i <=x ; i++) {
//            if(x%i==0){
//                System.out.println(i);
//                break;
//            }
//        }

        //Task 7
//        System.out.println("Input x");
//        int x= scanner.nextInt();
//        for (int i = 1; i <=x ; i++) {
//            if(x%i==0){
//                System.out.print(i+" ");
//            }
//        }

        //Task 8
//        System.out.println("Input x");
//        int x= scanner.nextInt();
//        int sum=0;
//        for (int i = 1; i <=x ; i++) {
//            if(x%i==0){
//               sum++;
//            }
//        }
//        System.out.println(sum);

        //Task 9
//        int sum=0;
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println("Input number " + i);
//            int num= scanner.nextInt();
//            sum+=num;
//        }
//        System.out.println("Your number sum is "+ sum);

        //Task 10
//        System.out.println("Input binary number");
//        int bin= scanner.nextInt();
//        int sum=0;
//        for (int i = 0; bin>0 ; i++) {
//            sum+=Math.pow(2,i)*(bin%10);
//            bin/=10;
//        }
//        System.out.println("Your binary number in digital is "+ sum);


        //Task 11
        //Bovandakutyun@ chaskaca

        //Task 12
//        System.out.println("Input number");
//        int n=scanner.nextInt();
//        int sum=0;
//        for (int i = 1;  ; i++) {
//            for (int j = 0; j <i ; j++) {
//                System.out.print(i+ " ");
//                sum++;
//                if(sum==n){
//                    return;
//                }
//            }
//        }

        //Task13
//        System.out.println("input number");
//        int n=scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <n ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //Task14
//        System.out.println("Input number");
//        int n= scanner.nextInt();
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j < n; j++) {
//                if(i%2!=0){
//                    System.out.print(" #");
//                }
//                else{
//                    System.out.print("# ");
//                }
//            }
//            System.out.println();
//        }

        //Task 15
//        System.out.println("Input size");
//        int n= scanner.nextInt();
//        System.out.print(" * |");
//        for (int i = 1; i <= n; i++) {
//            if(i<10) {
//                System.out.print("   " + i);
//            }
//            if (i>=10 && i<100){
//                System.out.print("  " + i);
//            }
//            if (i>=100 && i<1000){
//                System.out.print("  " + i);
//            }
//        }
//        System.out.println();
//        for (int i = 0; i <=n ; i++) {
//            System.out.print("----");
//        }
//        System.out.println();
//        for (int i = 1; i <=n; i++) {
//            if(i<10) {
//                System.out.print(" " + i+" |");
//            }
//            if (i>=10 && i<100){
//                System.out.print( i+" |");
//            }
//            if (i>=100 && i<1000){
//                System.out.print( i+"|");
//            }
//            for (int j = 1; j <=n ; j++) {
//                if(i*j<10) {
//                    System.out.print("   " + i*j);
//                }
//                if (i*j>=10 && i*j<100){
//                    System.out.print("  " + i*j);
//                }
//                if (i*j>=100 && i*j<1000){
//                    System.out.print(" " + i*j);
//                }
//            }
//            System.out.println();
//        }

        //Task 16
//        System.out.println("Input number");
//        int n = scanner.nextInt();
//        System.out.println("Input Variant a,b,c or d");
//        char variant = scanner.next().charAt(0);
//        switch (variant) {
//            case 'a':
//                for (int i = 0; i <= n; i++) {
//                    for (int j = 0; j < i; j++) {
//                        System.out.print("*");
//                    }
//                    System.out.println();
//                }
//                break;
//            case 'b':
//                for (int i = 0; i <= n; i++) {
//                    for (int j = 0; j + i < n; j++) {
//                        System.out.print("*");
//                    }
//                    System.out.println();
//                }
//                break;
//            case 'c':
//                for (int i = 0; i <= n; i++) {
//                    for (int j = 0; j < n; j++) {
//                        if (j < i) {
//                            System.out.print(" ");
//                        } else {
//                            System.out.print("*");
//                        }
//                    }
//                    System.out.println();
//                }
//                break;
//            case 'd':
//                for (int i = 0; i <= n; i++) {
//                    for (int j = 0; j < n; j++) {
//                        if (i + j >= n) {
//                            System.out.print("*");
//                        } else {
//                            System.out.print(" ");
//                        }
//                    }
//                    System.out.println();
//                }
//                break;
//            default:
//                System.out.println("error");
//                break;
//
//        }


//


    }


}
