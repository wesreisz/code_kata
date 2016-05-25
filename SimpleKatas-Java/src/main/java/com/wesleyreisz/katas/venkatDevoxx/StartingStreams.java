package com.wesleyreisz.katas.venkatDevoxx;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wesleyreisz on 5/10/16.
 */
public class StartingStreams {
    public static void main(String... args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Timeit.code(()->
            System.out.println(
                numbers.stream()
                    .filter(e -> e%2 == 0)
                    .mapToInt(StartingStreams::compute)
                    .sum()
            )
        );

        Timeit.code(()->
            System.out.println(
                //numbers.stream()
                numbers.parallelStream()
                    .filter(e -> e%2 == 0)
                    .mapToInt(StartingStreams::compute)
                    .sum()
            )
        );
    }

    public static int compute(int input){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return input *2;
    }
}
