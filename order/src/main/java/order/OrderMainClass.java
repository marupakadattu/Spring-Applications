package order;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderMainClass {

	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Order.xml");
		Order or = (Order)ac.getBean("order1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Oder Details\n Oder Id : ");
		or.setoId(sc.nextInt());
		System.out.println("Order Name");
		or.setoName(sc.next());
		System.out.println(or.toString());
		or.destroy();	
	}

}
