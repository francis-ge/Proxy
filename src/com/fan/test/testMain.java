package com.fan.test;

import com.fan.FanImpl;;

public class testMain {
	
	public static void main(String[] args) {
		
		FanImpl runnable = new FanImpl();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		
		thread1.setName("thread1");
		thread2.setName("thread2");
		
		thread1.start();
		thread2.start();
	}
}
