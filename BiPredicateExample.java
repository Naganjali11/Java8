package com.codegnan.java8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer>p=(a,b)->(a+b)%2==0;
		System.out.println(p.test(10, 20));
		System.out.println(p.test(10, 5));
		
		BiFunction<Integer,Integer,Integer>sum=(a,b)->a+b;
		BiFunction<Integer,Integer,Integer>product=(a,b)->a*b;
	System.out.println(sum.apply(10,75));
	System.out.println(product.apply(25,125));
	
	}

}
