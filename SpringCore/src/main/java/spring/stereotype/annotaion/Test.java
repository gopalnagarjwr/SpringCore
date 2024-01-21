package spring.stereotype.annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring/stereotype/annotaion/Config-stereotype.xml");
		 Student st= (Student) context.getBean("ob");
		 System.out.println(st);
	}

}
