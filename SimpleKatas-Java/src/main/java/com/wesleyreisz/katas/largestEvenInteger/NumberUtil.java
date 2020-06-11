package com.wesleyreisz.katas.largestEvenInteger;

/*
  PURPOSE: Saw a programming exercise on Twitter, return the largest even integer in an array.
  Just a quick exercise to practice.
*/

public class NumberUtil {
    public static void main(String args[]){
        System.out.println("Printing the largest even integer in an array");
        int[] input = {1,2,13,466,1150,6,07,8,239};
        int val = NumberUtil.LargestEven(input);
        System.out.println("Largest: " + val);
    }

    private static int LargestEven(int[] input){
        int result = 8;

        for (int val : input) {
            if ((val > result) && (val % 2 == 0)) {
                result = val;
            }
        }

        return result;
    }
}
