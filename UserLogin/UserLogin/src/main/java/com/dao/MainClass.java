package com.dao;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.UserReg;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

		UserImplement userJDBCTemplate = 
	         (UserImplement)context.getBean("userJDBCTemplate");
	      Scanner sc = new Scanner(System.in);
	      System.out.println("------Records Creation--------" );
	      System.out.println("Enter Your id, name, password, email and phonenumber");
	      UserReg  user = new UserReg();
	      user.setUserid(sc.nextInt());
	      user.setUname(sc.next());
	      user.setPassword(sc.next());
	      user.setEmail(sc.next());
	      user.setPhonenumber(sc.next());
	      userJDBCTemplate.create(user);
	      System.out.println("------Listing Multiple Records--------" );
	     // List<UserReg> students = UserImplement.listUser();
	      

	}

}
