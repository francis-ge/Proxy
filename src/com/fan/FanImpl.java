package com.fan;

import org.junit.runner.notification.RunNotifier;

public class FanImpl implements Fan, Runnable{
	private String name;
	private double power;
	private char str='a';
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	
	
	public FanImpl() {
		super();
	}
	public FanImpl(String name, double power) {
		super();
		this.name = name;
		this.power = power;
	}
	
	public void stop(){
		System.out.println("·ç»úÍ£Ö¹");
	}
	
	public boolean print(){
		
		synchronized(this)  {

			if(str<='z'){
				System.out.println(Thread.currentThread().getName() + ":" + str);
				try {
					Thread.sleep(10);
				
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				str++;	
				return true;
			}
			
			return false;		
		
		}
	}

	@Override
	public void run(){
		boolean bool = print();
		while(bool){
			bool = print();
		}
	}
	@Override
	public String toString() {
		return "Fan [name=" + name + ", power=" + power + "]";
	}
	
	

	
}
