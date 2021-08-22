package com.company;

public class Maxwealth {
    public static void main(String[] args){
        int[][] accounts= {
                {1,2,3},
                {20, 11, 23},
                {2,3,4}

        };
       int  num = wealth(accounts);
        System.out.println(num);


    }
    // person = row
    //account = col
    static int wealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;

        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;//sum += account[p][a]


            }
            //we have overall anser
            //check max ans
            if (sum > ans) {
                ans = sum;
            }

        }
        return ans;
    }
}
