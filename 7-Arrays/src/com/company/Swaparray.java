package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Swaparray {
    public static void main(String[] args) {
        int[] arr = {1,2,30,40,50};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp ;
    }
}
