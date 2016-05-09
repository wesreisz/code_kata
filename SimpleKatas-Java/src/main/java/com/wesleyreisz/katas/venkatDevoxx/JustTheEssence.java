package com.wesleyreisz.katas.venkatDevoxx;

/**
 * Created by wesleyreisz on 5/9/16.
 */
public class JustTheEssence {
    public static void main(String... args){
        //functions has 4 things
        //1. name - anonymous
            //2. parameter list
            //3. body
        //4. return type - inferred
        Thread th = new Thread(() -> System.out.println("In thread"));
        th.start();

        System.out.println("In main");
    }
}
