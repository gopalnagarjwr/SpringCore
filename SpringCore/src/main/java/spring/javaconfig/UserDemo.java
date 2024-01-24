package spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDemo {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		User u = (User) context.getBean("newUser");
		System.out.println(u.hashCode());
		u.me();
		System.out.println(u.getAdd());

	}

}
