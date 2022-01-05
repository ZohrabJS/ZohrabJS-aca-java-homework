package com.aca.DAY13;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        countVowelsDigits(str);
    }
   public static void countVowelsDigits(String str){
        int sum1=0;
        int sum2=0;
       for (int i = 0; i <str.length() ; i++) {
           if (str.charAt(i)=='A'||str.charAt(i)=='a'||str.charAt(i)=='E'||str.charAt(i)=='e'||str.charAt(i)=='O'||str.charAt(i)=='o'||str.charAt(i)=='U'||str.charAt(i)=='u'||str.charAt(i)=='I'||str.charAt(i)=='i'){
               sum1++;
           }
           if (str.charAt(i)>='0'&&str.charAt(i)<='9'){
               sum2++;
           }
       }
       System.out.println("Number of vowels: "+sum1+" ("+( (double) sum1/str.length()*100)+"%)");
       System.out.println("Number of digits: "+sum2+" ("+( (double) sum2/str.length()*100)+"%)");
   }
}
