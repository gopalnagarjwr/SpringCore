package spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	     ApplicationContext context=  new ClassPathXmlApplicationContext("spring/constructor/Config-con.xml");
	    Emp em=(Emp) context.getBean("E1");
	    System.out.println(em);

	}

}
