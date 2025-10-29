package com.codegnan.java8;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<Integer, Integer> f1=i-> i * i;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-2));
		
		Function<String, Integer> f2=s-> s.length();
		System.out.println(f2.apply("chandu"));
		System.out.println(f2.apply("vindhya"));

	}

}
