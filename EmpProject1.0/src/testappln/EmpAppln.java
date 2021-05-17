package testappln;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import models.Department;
import models.Employee;

public class EmpAppln {

	public static void main(String[] args) {
		 ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		 Employee e = (Employee)ac.getBean("employeebean");
		 e.displayInfo();
	}
}