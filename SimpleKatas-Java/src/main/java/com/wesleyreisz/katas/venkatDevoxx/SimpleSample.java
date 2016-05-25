package com.wesleyreisz.katas.venkatDevoxx;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by wesleyreisz on 5/10/16.
 */
public class SimpleSample {
    public static void main(String... args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        //external iterators
//        for(int i = 0; i<numbers.size(); i++){
//            System.out.println(i);
//        }

        //external iterators also
//        for(int number : numbers){
//            System.out.println(number);
//        }

        //internal iterators
//        numbers.forEach(new Consumer<Integer>(){
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });

        //internal iterator as a lambda
        numbers.forEach(integer -> System.out.println(integer));
        //Java 8 has type inference, only for lambda expressions
        //parenthesis is optional, but only for one parameter lambdas

        numbers.forEach(System.out::println);
        //method references are only when you want to pass on what you receive to the next input

    }
}
