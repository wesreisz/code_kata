package com.wesleyreisz.katas.venkatDevoxx;

/**
 * Created by wesleyreisz on 5/9/16.
 */
public class JustTheEssence1 {
    public static void main(String... args) {
        /*
            Lamda's are not implemented as anonymous classes. Anonymous classes would create a bunch of files
            to disk. What lamda's do is leverage invokedynamic (which was created in Java 7 for dynamic lanaguges).
            By using invoke dynamic lambas are function pointers that can be passed around.
            So you can see the effect of this by look at the scala example in the root of this project.
            In the scala example... a lamda was called but an anonymous class is used by the compiler
            The same thing in java 8 has much less noise.
            Therefore, you don't have the overhead of all these bloat or overheard from anonymous classes.
        */
//        Thread th = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("In thread");
//            }
//        });
        //        th.start();

        Thread th;
        th = new Thread(() -> System.out.println("In thread"));
        th.start();


        System.out.println("Outside thread");
    }
}
