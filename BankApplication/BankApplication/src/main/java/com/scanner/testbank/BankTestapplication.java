package com.scanner.testbank;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scanner.bank.Customer;


public class BankTestapplication {
	
	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("scanbankbeans.xml");
	        Customer customer1 = (Customer) context.getBean("customer");
  	        
	        Scanner scanner = new Scanner(System.in);
	        Customer customer = new Customer();
//	        Account account = new Account();
//	        System.out.println("Eneter the Account Number");
//	        account.setAccountNumber(scanner.next());
//	        System.out.println("Enter Account Type");
//	        Set s1= new HashSet();
//	        s1.add(scanner.next());
//	        account.setAccountType(s1);
	        System.out.println("Enter the Account Number");
//	        customer1.cAccounntNumber = scanner.next();
	        customer1.setcAccounntNumber((scanner.next()));
	    
	        Set<String> s = new HashSet<String>();
	        System.out.println("Enter the Account type");
	          s.add(scanner.next());
	          customer1.setcAccountType(s);
	         
	         
	        System.out.println("Enter the PhoneNumber");
	        customer.setcPhone(scanner.next());

	 

	         System.out.println(customer1.toString());
	}
}
