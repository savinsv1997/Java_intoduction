package com.company;

public class Smallnumber {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40,50,60,100};

        int target = 30;
        int ans = small(arr , target);
        System.out.println(ans);





    }
    static int small(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length ; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }


        }
        return  -1;






    }

}
