package com.company;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        if(n <= 1){
            System.out.println("Neither prime nor composite");
            return;
        }
        int c = 2;
        if(n == 4){
            System.out.println("not a prime");
            return;
        }else {
            while(c * c < n){
                if (n % c == 0){
                    System.out.println("not prime");
                    return;
                }
                c = c + 1;
                if (c * c > n){
                    System.out.println("prime");
                    return;
                }
            }
        }






    }
}
