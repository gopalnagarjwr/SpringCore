package spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("spring/lifecycle/Config-life.xml");
		       Emp e=(Emp) context.getBean("E");
		       System.out.println(e);
		       context.registerShutdownHook();

	}

}
