package com.wesleyreisz.katas.successiveRuns;

public class Test {
    public static void main(String[] args){
        //Ex: "aaab", 2 => "aab"
        //Ex: "aabb", 1 => "ab"
        //Ex: "aabbaa", 1 => "aba"
        String result = StringUtils.removeCharactersInSuccession("aabbaa",1);
        System.out.println(result);
    }
}
