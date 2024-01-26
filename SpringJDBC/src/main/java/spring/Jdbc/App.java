package spring.Jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import spring.Jdbc.Entity.Emp;
import spring.Jdbc.dao.EmpDao;
import spring.Jdbc.dao.EmpDaoImpl;

public class App {
	public static void main(String[] args) {
		System.out.println(" Start Conection.. !");

//      by XML File Configuration

//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/Jdbc/JdbcConfig.xml");
//		EmpDao em = context.getBean("empdao", EmpDaoImpl.class);

//      by Java Annotation Configuration

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		EmpDao em = context.getBean("empdao", EmpDaoImpl.class);

//		Emp emp=new Emp(); 
//		emp.setId(104); 
//		emp.setName("mohit"); 
//		emp.setCity("bara");

//      Insert data from data
//      int row = em.getInsert(emp);

//      Update data from table 		
//      int row = em.getUpdate(emp);

//		Delete data from Table 
//      int row = em.getDelete(103);
//      System.out.println("number of row effected "+row);

//      only one object get from Table		
//		Emp emp = em.getData(101);
//		System.out.println(emp);

//      get all the data from table 		
		List<Emp> ll = em.getAllData();
		for (Emp emp : ll) {
			System.out.println(emp);
		}

	}
}
