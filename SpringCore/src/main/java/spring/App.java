package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
         ApplicationContext context =new ClassPathXmlApplicationContext("Config.xml");
         
		 
			  Student s1=(Student) context.getBean("st1"); Student s2=(Student)
			  context.getBean("st2");
			  
         Student s3=(Student) context.getBean("st3");
			  System.out.println(s1);
			  System.out.println(s2);
			 
         System.out.println(s3);
    }
}
