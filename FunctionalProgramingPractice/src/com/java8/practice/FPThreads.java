package com.java8.practice;

import java.util.stream.IntStream;

public class FPThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable runnable = () -> {
				IntStream.range(0, 30).forEach(i->System.out.println(Thread.currentThread().getId()+":" + i));
		};
		
		Thread thread1 = new Thread(runnable);
		thread1.start();
		
		Thread thread2 = new Thread(runnable);
		thread2.start();
		
		Thread thread3 = new Thread(runnable);
		thread3.start();

	}

}
