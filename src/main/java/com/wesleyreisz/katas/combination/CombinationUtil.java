package com.wesleyreisz.katas.combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a function that combines two lists by alternatingly taking elements.
 * For example: given the two lists [a, b, c] and [1, 2, 3], the function
 * should return [a, 1, b, 2, c, 3].
 */

public class CombinationUtil {

    public static char[] combine(char[] list1, char[] list2) throws Exception {
        if(list1.length<=0 || list2.length<=0){
            throw new Exception("Invalid lists passed to function.");
        }

        int counter = 0, position=0;
        int maxLength = list1.length>list2.length?list1.length:list2.length;

        char[] results = new char[list1.length+list2.length];

        while(counter<maxLength){
            if(counter<list1.length)
                results[position++]=list1[counter];//first list
            if(counter<list2.length)
                results[position++]=list2[counter];//second list

            counter++;
        }

        return results;
    }
}
