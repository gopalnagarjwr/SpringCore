package spring.autowiring;

public class Emp {
	private Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		System.out.println("by byName");
		this.add = add;

	}

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
