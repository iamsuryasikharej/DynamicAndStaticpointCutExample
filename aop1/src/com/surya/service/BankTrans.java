package com.surya.service;

public class BankTrans {
	static int bal=100;
public void deposit(int x)

{ 
	System.out.println("entry deposit");
	bal=bal+x;
}
public void withdraw(int x)

{ 
	System.out.println("entry withdraw");
	bal=bal-x;
}
}
