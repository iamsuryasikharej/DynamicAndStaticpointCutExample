package com.surya.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class EmployeeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("----------------------------------------------");
		System.out.println("Validation Message is for +++>>"+arg0.getName());
		for(int i=0;i<arg1.length;i++)
		{
			System.out.println(arg1[i]);
		}
		System.out.println("----------------------------------------------");
	}

}
