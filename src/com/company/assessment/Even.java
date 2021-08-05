package com.company.assessment;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        if(num > 0){
            if(num % 2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("odd");
            }

        }else{
            System.out.println("zero or negative");
        }

    }
}
