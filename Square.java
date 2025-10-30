package com.codegnan.java8;

public class Square {
    public static void main(String[] args) {
        Interf1 i = a -> a * a;
        System.out.println(i.squareIt(10));
        System.out.println(i.squareIt(5));
    }
}
