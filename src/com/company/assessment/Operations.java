package com.company.assessment;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        int Sum,Sub,Multi;
        float Div;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 =in.nextInt();
        System.out.print("Enter the num2: ");
        int num2 =in.nextInt();
        System.out.print("Enter the A operation :");
        char operation = in.next().charAt(0);
        if(operation == '+'){
            Sum = num1 + num2;
            System.out.print("Final result :" +Sum);

        }else if (operation == '-'){
            Sub = num1 - num2;
            System.out.print("Final result :"+ Sub);

        }else if(operation== '*'){
            Multi = num1 * num2;
            System.out.print("Final result :"+ Multi);

        }else  if(operation  == '/')      {
            Div = num1 / num2;
            System.out.print("Final result :"+ Div);
        }
        else{
            System.out.println("Enter the correct operation");
        }


    }
}
