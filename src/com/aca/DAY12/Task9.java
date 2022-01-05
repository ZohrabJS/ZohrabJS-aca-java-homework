package com.aca.DAY12;

public class Task9 {
    public static void main(String[] args) {
        fahrenheitCelsius(32.0F,1);
        fahrenheitCelsius(1,10f);

    }
    public static void fahrenheitCelsius(float celsius, int choice){
        if (choice==1){
            System.out.println((int)celsius+ " celsius is "+ (int) ((celsius*5/9)+32)+" fahrenheit");

        }
        else{
            System.out.println(((double) celsius+ " celsius is "+ (double) ((celsius*5/9)+32)+" fahrenheit"));
        }
    }
    public static void fahrenheitCelsius(int choice, float fahrenheit){
        if (choice==1){
            System.out.println((int)fahrenheit+ " fahrenheit is "+ (int) ((fahrenheit-32)*5/9)+" celsius");

        }
        else{
            System.out.println(((double) fahrenheit+ " fahrenheit is "+ (double) ((fahrenheit-32)*5/9)+" celsius"));
        }
    }
}
