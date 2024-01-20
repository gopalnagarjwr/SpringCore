package spring.lifecycle;

public class Emp {
      
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("value set");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	public void init() {
		System.out.println("this is init method ");
	}
	public void destroy() {
		System.out.println("this is destroy method ");
	}
	
}
