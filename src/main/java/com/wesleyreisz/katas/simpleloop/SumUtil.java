package com.wesleyreisz.katas.simpleloop;

import java.util.stream.*;
import java.util.Arrays;
/*
https://www.shiftedup.com/2015/05/07/five-programming-problems-every-software-
engineer-should-be-able-to-solve-in-less-than-1-hour

Problem 1
Write three functions that compute the sum of the numbers in a given list using 
a for-loop, a while-loop, and recursion.
*/

public class SumUtil{
    public static long addWithFor(int[] listOfNumbers){
        long result = 0;
        for(int number : listOfNumbers){
            result += number;
        }
        return result;
    }
    public static long addWithForDeclarative(int[] listOfNumbers){
        return Arrays.stream(listOfNumbers).sum();
    }
    public static long addWithWhileLoop(int[] listOfNumbers){
        int i = 0;
        long result = 0;
        while(i<listOfNumbers.length){
            result += listOfNumbers[i];
            i++;
        }
        return result;
    }
    public static long addWithRecursion(int[] listOfNumbers) {
        return recursiveAdd(listOfNumbers,listOfNumbers.length-1);
    }

    private static long recursiveAdd(int[] listOfNumber, int count){
        if(count==0){
            return listOfNumber[count];
        }else{
            return listOfNumber[count] + recursiveAdd(listOfNumber,count-1);
        }
    }
}