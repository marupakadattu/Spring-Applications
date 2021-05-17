package constructormode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans2.xml");
		 Employee e = (Employee)ac.getBean("ep");
		 System.out.println(e.toString());
	}
}
