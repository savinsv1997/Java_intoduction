package com.company.assessment;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum=n;
        while(n!=0){

            sum = sum + n;
        }
        System.out.println("Enter the sum: "+ sum);
    }




}
