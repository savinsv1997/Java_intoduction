package com.company.assessment;

import java.util.Scanner;

public class Fractionall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int i,Factor = 1;
        if(num<0){
            System.out.println("Its a negative number");
            return;
        }else if (num == 0){
            System.out.println("Factorial of o is 1");
            return;
        }
        else{
            for(i=1;i <= num ; i++)

                Factor = Factor * i;



        }
        System.out.println("Factorial is : "+ Factor);


    }

}
