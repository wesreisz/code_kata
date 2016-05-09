package com.wesleyreisz.katas.demos;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wesleyreisz on 5/5/16.
 */
public class Exercises {
    public static void main(String... args){
        //simple
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(number -> System.out.println(number));

        //declare type
        List<Integer> numbers1 = Arrays.asList(6,7,8,9,10);
        numbers1.forEach((Integer number) -> System.out.println(number));

        //multiple items in body
        List<Integer> numbers2 = Arrays.asList(11,12,13,14,15);
        numbers2.forEach(number -> {
            String test = " test option";
            System.out.println(number + test);
        });

        Test t = () -> System.out.println("Doing Something");
        TestComplicated t1 = (x,y) -> System.out.println("Doing Something" + x + y);
    }
}
