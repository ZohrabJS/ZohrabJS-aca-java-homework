package com.aca.DAY13;

public class Task3 {
    public static void main(String[] args) {
        String str ="Armenia";
        System.out.println(size(str,'e'));
    }
    public static boolean size(String str, char a){
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==a){
                return true;
            }
        }
        return false;
    }
}
