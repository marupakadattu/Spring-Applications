package com.testbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankbeans.Customer;

public class BankTestapplication {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bankbeans.xml");
		Customer c = (Customer)ac.getBean("bank1");
		//System.out.println(c.toString());
		System.out.println(c.getCustId());
		System.out.println(c.getCustName());
		System.out.println(c.getPhoneNumber());
		System.out.println(c.getLoans());
		System.out.println(c.getTransaction());
		System.out.println(c.getAccounts());
		//System.out.println(c.getClass());
}
}
