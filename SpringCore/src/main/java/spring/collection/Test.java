package spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 ApplicationContext context= new ClassPathXmlApplicationContext("spring/collection/CConfig.xml");
               User u=(User) context.getBean("U1");
               System.out.println(u.getName());
               System.out.println(u.getMobail());
               System.out.println(u.getCity());
               System.out.println(u.getCours());
	}

}
