package spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 
           ApplicationContext context= new ClassPathXmlApplicationContext("spring/ref/Config-ref.xml");
          A ob= (A) context.getBean("aref");
          System.out.print(ob);
	}

}
