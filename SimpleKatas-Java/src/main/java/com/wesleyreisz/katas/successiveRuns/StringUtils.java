package com.wesleyreisz.katas.successiveRuns;

/*
 Task: Write a function that takes two parameters, a string and an integer. The function will return another string that
 is similar to the input string, but with certain characters removed. It's going to remove characters from consecutive
 runs of the same character, where the length of the run is greater than the input parameter.
 */

public class StringUtils {
    //aabb
    public static String removeCharactersInSuccession(String input, int testLength){
        char prev = '\u0000'; //default char value
        int counter = 0;

        StringBuilder sb = new StringBuilder();
        for (char cur : input.toCharArray()){
            if (prev == '\u0000') {
                prev = cur;
                counter = 1;
            }else{
                if (cur == prev){
                    counter++;
                    if (counter>=testLength){
                        continue;
                    }
                }else{
                    counter = 1;
                }

                prev = cur;
            }
            sb.append(cur);
        }

        return sb.toString();
    }
}


