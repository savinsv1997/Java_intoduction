package com.company;

public class Arguments {
    public static void main(String[] args) {
        //int ans = sum3(10,20);
        String ans = greet("savin");
        System.out.println(ans);
    }
    static String greet(String greet){
        String message = "Hello" +greet;
        return message;

    }

    //pass the value of numbers when you are calling the method in main
    static int sum3(int a ,int b){
        int sum = a +b ;
        return sum;

    }

}
