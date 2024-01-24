package spring.javaconfig;

import org.springframework.stereotype.Component;

// @Component
public class User {
	private Address Add;

	public void me() {
		System.out.println("I am the user ... ");
	}

	public Address getAdd() {
		return Add;
	}

	public void setAdd(Address add) {
		Add = add;
	}

	public User(Address add) {
		super();
		Add = add;
	}

}
