package com.codegnan.java8;

public class ThreadDemo {
	public static void main(String[] args) {
		
//Runnable r=new MyRunnable();
		Runnable r=()->{
			for(int i=0;i<=6;i++) {
			System.out.println("Hi");	
			}
		};
Thread t=new Thread(r);
t.start();
for(int i=0;i<5;i++) {
	System.out.println("Main Thread");
}

}
}
