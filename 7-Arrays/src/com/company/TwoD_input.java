package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][2];

//       int[][] arr2D = {
//                {10,20,30},
//                {10,11},
//                {22,44,55,77},
//        };//input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }

        }
        for (int[] ints : arr) {

            for (int anInt : ints) {

                System.out.print(anInt);

            }
            System.out.println();
        }
    }

}
