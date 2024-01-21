package spring.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/autowiring/annotation/Config-autowiring-annotation.xml");
		Emp e = (Emp) context.getBean("E");
		System.out.println(e);
	}
}
