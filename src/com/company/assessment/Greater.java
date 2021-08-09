package com.company.assessment;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        int Sum, Sub, Multi;
        float Div;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = in.nextInt();
        int large;
        if(num1 > num2){
            large = num1;
          //  System.out.println("Large number "+ num1);
        }else if(num2 > num1){
            large = num2;
           // System.out.println("Large number:"+ num2);
        }else{
            System.out.println("Both are equal");
        }
        System.out.println("Large number is  "+ num1+ "   " +("among" + num1 +"  " + num2));

    }
}
