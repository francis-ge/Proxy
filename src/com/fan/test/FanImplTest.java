package com.fan.test;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

import com.fan.Fan;
import com.fan.FanImpl;

public class FanImplTest {

	@Test
	public void testStop() {
		Fan fanProxy= (Fan)Proxy.newProxyInstance(FanImpl.class.getClassLoader(), 
				new Class[]{ Fan.class}, 
				new InvocationHandler(){			
			
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						System.out.println("invoke...");
						method.invoke(new FanImpl(), args);
						return null;
					}
		});
		
		fanProxy.run();

	}
}
