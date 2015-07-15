package com.fan.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fan.FanImpl;

public class testFanThread {

	@Test
	public void testFanThread1() {
		
		FanImpl runnable = new FanImpl();
		Thread  thread1  = new Thread(runnable);
		Thread  thread2  = new Thread(runnable);

		thread1.setName("thread1");
		thread2.setName("thread2");
		
		thread1.start();
		thread2.start();
			
	}

}
