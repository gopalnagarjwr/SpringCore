package spring.orm.productDao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import spring.orm.entity.Student;

public class ProductDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {

		this.hibernateTemplate = hibernateTemplate;

	}

//  Insert data in Table
	@Transactional
	public void insert(Student product) {
		if (hibernateTemplate != null) {
			hibernateTemplate.save(product);
		} else {

			throw new IllegalStateException("HibernateTemplate is not initialized");
		}
	}

//  read Student from Table
	public Student getStudent(int st_rollnumber) {
		Student s = this.hibernateTemplate.get(Student.class, st_rollnumber);
		return s;
	}

//  read all students from Table
	public void getAllStudent() {
		List<Student> loadAll = this.hibernateTemplate.loadAll(Student.class);
		for (Student s : loadAll) {
			System.out.println("________________________________________________________");
			System.out.println(s);
		}
	}

//  Delete student data from Table
	@Transactional
	public void deleteStudent(Student s) {
		this.hibernateTemplate.delete(s);
		System.out.println("________________________________________________________");
		System.out.println("Student data deleted");
	}

//  update Student data from Table
	@Transactional
	public void updateStudent(Student s) {
		this.hibernateTemplate.update(s);
		System.out.println("________________________________________________________");
		System.out.println("Student data Update ");
	}
}
