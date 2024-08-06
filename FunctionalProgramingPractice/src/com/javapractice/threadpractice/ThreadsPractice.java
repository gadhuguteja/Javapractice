package com.javapractice.threadpractice;

import java.util.concurrent.locks.Lock;

public class ThreadsPractice{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lock1 = "test1";
		String lock2 = "test2";
		
		Thread t1 = new Thread(()->{
			synchronized(lock1) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(lock2) {
					System.out.println("Thread2");
				}
			}
		}, "Thread1");
		System.out.println("Main therad is running");
		
		Thread t2 = new Thread(()->{
			synchronized(lock2) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(lock1) {
					System.out.println("Thread1");
				}
			}
		}, "Thread2");
		t2.start();
		t1.start();

	}


}
