package com.company.assessment;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = in.nextLine();
        System.out.println("Hi How are you :"+ name);
    }
}
