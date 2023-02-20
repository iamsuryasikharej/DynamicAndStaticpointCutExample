package com.surya.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.surya.service.BankTrans;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/com/surya/resources/applicationContext.xml");
		BankTrans bankTrans=(BankTrans)applicationContext.getBean("proxy");
		bankTrans.deposit(100);
		bankTrans.withdraw(10);
		
		bankTrans.deposit(100);
		bankTrans.withdraw(10);

	}

}
