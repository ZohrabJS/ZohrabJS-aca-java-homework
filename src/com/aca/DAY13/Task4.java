package com.aca.DAY13;

public class Task4 {
    public static void main(String[] args) {
        String str="Armenia";
        System.out.println(count(str));
    }
    public static int count(String str){
        int sum=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='A'||str.charAt(i)=='a'||str.charAt(i)=='E'||str.charAt(i)=='e'||str.charAt(i)=='O'||str.charAt(i)=='o'||str.charAt(i)=='U'||str.charAt(i)=='u'||str.charAt(i)=='I'||str.charAt(i)=='i'){
                sum++;
            }
        }
        return sum;
    }
}
