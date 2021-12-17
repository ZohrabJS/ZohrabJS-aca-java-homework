package com.aca;
import java.util.Scanner;
import java.util.Random;
public class DAY4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task1
        /*
        System.out.println("Input your age");
        int age= scanner.nextInt();
        if (age>=18) {
            System.out.println("You are  the right to vote.");
        }
        else {
            System.out.println("You have no right to vote.");
        }
         */
        //Task 2
        /*
        System.out.println("Input number");
        int num=scanner.nextInt();
        if (num%2==0){
            System.out.printf("Input number is an even number");
        }
        else{
            System.out.println("Input number is an odd number");
        }
         */
        //Task 3
        /*
        Random rand = new Random();
        System.out.println("Random number 2 to 7");
        int r=rand.nextInt(2,7);
        System.out.println(r);
         */
        //Task 4
        /*
        System.out.println("Input number");
        int num=scanner.nextInt();
        if (num%5==0){
            System.out.println("Number is a multiple of a 5");
        }
        else{
            System.out.println("Number is not a multiple of 5");
        }
         */
        //Task 5

        System.out.println("Input number 1");
        int n1=scanner.nextInt();
        System.out.println("Input number 2");
        int n2= scanner.nextInt();
        System.out.println("Input number 3");
        int n3= scanner.nextInt();
        int max=n1;
        if(max<n2){
            max=n2;
        }
        if(max<n3){
            max=n3;
        }
        System.out.println("Max number - "+max);

        //Task 6
        //Task 7

    }
}
