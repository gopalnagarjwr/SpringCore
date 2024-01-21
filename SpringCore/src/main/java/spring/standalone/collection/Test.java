package spring.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/standalone/collection/Config-standalone-collection.xml");

		Persone p = context.getBean("p", Persone.class);
		System.out.println(p.getFriends());
		System.out.println(p.getCity() );
		System.out.println("_____________________________________________");
		System.out.println();
		Persone p1 = context.getBean("p1", Persone.class);
		System.out.println(p1.getFriends());
		System.out.println(p1.getCity() );
	}
}
