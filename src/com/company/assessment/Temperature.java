package com.company.assessment;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int TempC = a.nextInt();

        int TempF = (TempC * 9/5) + 32;
        System.out.println("far :"+ TempF);
    }
}
