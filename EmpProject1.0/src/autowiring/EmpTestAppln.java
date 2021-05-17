package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTestAppln {

	public static void main(String[] args) {
		 ApplicationContext ac = new ClassPathXmlApplicationContext("benas1.xml");
		 Employee e = (Employee)ac.getBean("emp");
		 System.out.println(e.toString());
	}

}
