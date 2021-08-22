package com.company;

public class Amstrung {
    public static void main(String[] args) {
     //   boolean ans = isAmastrung()
        System.out.println(isAmastrung(25));
    }
    static boolean isAmastrung(int n){
        int original = n;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            n = n /10;
            sum = sum + rem*rem*rem;


        }
        return sum == original;
    }
}
