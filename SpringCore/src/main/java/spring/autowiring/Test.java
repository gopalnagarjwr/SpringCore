package spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/autowiring/Config-autowiring.xml");
		Emp e = (Emp) context.getBean("E");
		System.out.println(e);
		Emp e1 = (Emp) context.getBean("E1");
		System.out.println(e1);
		Emp e2 = (Emp) context.getBean("E2");
		System.out.println(e2);
	}

}
