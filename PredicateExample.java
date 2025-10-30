package com.codegnan.java8;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
	Predicate<Integer> p=i->i>10;
	System.out.println(p.test(20));
	System.out.println(p.test(-20));
	System.out.println(p.test(10));
	Predicate<String> p1=s->s.length()>3;
	System.out.println(p1.test("Anjali"));
	System.out.println(p1.test("Bhanu"));
	
	Collection<String>c1=List.of();
	Collection<String>c2=List.of("malli","Arjun","Neha");
	@SuppressWarnings("rawtypes")
	Predicate<Collection> p2=c->c.isEmpty();
	System.out.println(p2.test(c1));
	System.out.println(p2.test(c2));
	
	}
	}



