package spring.invokMethod;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Emp {
	  @Value("#{T(java.lang.Math).PI}")
      private int id;
	  
	  @Value("#{new java.lang.String('gopal')}")
      private String name;
	  
	  @Value("#{T(java.lang.Math).sqrt(150)}")
      private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	  
	  
      
}
