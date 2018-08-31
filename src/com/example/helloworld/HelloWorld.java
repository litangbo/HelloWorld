package com.example.helloworld;

/**
 * The age-old Hello, World application is used as an example.
 * Writing code for the HelloWorld class
 * ★Code|Insert Live Templates     Ctrl+J
 * ★Code|Completion
 * ★Building and running the application
 * Created by 38415 on 2018/8/29.
 */
public class HelloWorld {
    // psfs
    public static final String HELLO_WORLD = "Hello, World!";
    /**
     * 1、Using a live template for the main() method
     * psvm
     * @param args
     */
    public static void main(String[] args) {
        // 2、Using code auto-completion
        System.out.println("Hello, World!");
        // 3、Using a live template for println()
        // sout
        System.out.println(HELLO_WORLD);
        // fori
        for (int count = 0; count < 10; count++) {
            System.out.println(count);
        }
        System.out.println("So each time you execute this run configuration, the artifact will be built automatically.");
        System.out.println("build twice.");
    }
}