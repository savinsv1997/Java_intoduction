package com.company.assessment;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the currency :");
        float cur =input.nextFloat();

        double dollar;
        dollar = cur*0.013;
        System.out.println("Dollar :"+ dollar);


    }
}
