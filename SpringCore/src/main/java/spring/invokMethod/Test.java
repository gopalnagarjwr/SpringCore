package spring.invokMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
     
	
	     public static void main(String args[]) {
	    	 ApplicationContext context= new ClassPathXmlApplicationContext("spring/invokMethod/Config-invokMethod.xml");
	  	   
	    	 Emp e=(Emp) context.getBean("emp");
	    	 System.out.println(e);
	     }
	  
	    
	 
}
