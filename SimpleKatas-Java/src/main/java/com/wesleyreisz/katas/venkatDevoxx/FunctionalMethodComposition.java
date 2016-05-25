package com.wesleyreisz.katas.venkatDevoxx;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wesleyreisz on 5/10/16.
 */
public class FunctionalMethodComposition {
    public static void main(String... args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        //given teh values, doublt the even numbers and total
        int sum = 0;
        for(int i : numbers){
            if(i%2==0){
                sum += i*2;
            }
        }
        System.out.println(sum);

        System.out.println(
            numbers.stream()
                    .filter(e -> e%2 ==0)
                    .map(e -> e* 2 )
                    .reduce(0,Integer::sum)
        );

        System.out.println(
                numbers.stream()
                        .filter(e -> e%2 ==0)
                        .mapToInt(e -> e* 2 )
                        .sum()
        );
        //follow the eyes on the for, follow the eyes on the bottom
    }
}
