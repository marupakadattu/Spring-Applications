package bytypeautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationEmployee {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beanss.xml");
		 Employee e = (Employee)ac.getBean("emp");
		 System.out.println(e.toString());
	}
}
