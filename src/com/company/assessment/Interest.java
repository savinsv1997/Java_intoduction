package com.company.assessment;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.print("Enter the name: ");
        int p = in.nextInt();
        int t = in.nextInt();
        int r = in.nextInt();

        int SI = (p * t * r) / 100;
        System.out.println("SImple intreste: " + SI);
    }
}
