package spring.orm;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.orm.entity.Student;
import spring.orm.productDao.ProductDao;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/orm/OrmConfig.xml");

		ProductDao pst = context.getBean("productDao", ProductDao.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("*******Welcome To Spring Project*******");

		while (true) {
			System.out.println();
			System.out.println("press 1 for add new Student");
			System.out.println("press 2 for display all Student");
			System.out.println("press 3 for detail of single Student");
			System.out.println("press 4 for delete Student");
			System.out.println("press 5 for update Student");
			System.out.println("press 6 for Exit ");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				Student st = new Student();
				System.out.println("enter roll number... ");
				st.setRollno(sc.nextInt());
				sc.nextLine();
				System.out.println("enter Name of Student... ");
				st.setName(sc.nextLine());
				System.out.println("enter City of Student... ");
				st.setCity(sc.nextLine());
				System.out.println();
				pst.insert(st);
				break;
			case 2:
				System.out.println();
				pst.getAllStudent();
				break;
			case 3:
				System.out.println("enter Student roll numebr... ");
				Student student2 = pst.getStudent(sc.nextInt());
				System.out.println();
				System.out.println(student2);
				break;
			case 4:
				System.out.println("enter Student roll number... ");
				Student student = pst.getStudent(sc.nextInt());
				pst.deleteStudent(student);
				break;
			case 5:
				Student s = new Student();
				System.out.println("enter roll number... ");
				s.setRollno(sc.nextInt());
				sc.nextLine();
				System.out.println("enter Name of Student... ");
				s.setName(sc.nextLine());
				System.out.println("enter City of Student... ");
				s.setCity(sc.nextLine());
				System.out.println();
				pst.updateStudent(s);
				break;
			case 6:
				System.out.println();
				System.out.println("Thanks for comming...");
				System.exit(0);
				break;
			default:
				System.out.println();
				System.out.println("Invalid input from you Please enter right input... ");
			}

		}

	}
}
