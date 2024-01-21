package spring.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("add1")		  //     first way
	private Address add;

	public Address getAdd() {
		return add;
	}
	
//	@Autowired                         secound way
	public void setAdd(Address add) {
		System.out.println("by byName");
		this.add = add;
	}

//	@Autowired                      third way
	public Emp(Address add) {
		super();
		this.add = add;
		System.out.println("by constructor");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [add=" + add + "]";
	}

}
