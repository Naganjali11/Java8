package com.codegnan.java8;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		c.accept("malli");
	}

}
