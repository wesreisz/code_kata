package com.wesleyreisz.katas.venkatDevoxx;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wesleyreisz on 5/10/16.
 */
public class MethodReferenceSample {
    public static void main(String... args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

//        numbers.forEach(e ->System.out.println(e));
//        numbers.forEach(System.out::println); //method reference to an instance method

//        numbers.stream()
//                //.map(e -> String.valueOf(e))
//                .map(String::valueOf) //reference to a static method
//                .forEach(System.out::println);

        System.out.println(
                numbers.stream()
                    //.reduce(0,(total,e) -> Integer.sum(total,e))
                    .reduce(0,Integer::sum) //replace what's common on both sides and add double colon. It becomes a method reference
    );

    }
}
