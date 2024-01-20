package spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
	 private String name;
	 private List<Integer> mobail;
	 private Set<String >city;
	 private Map<String ,String > cours;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getMobail() {
		return mobail;
	}
	public void setMobail(List<Integer> mobail) {
		this.mobail = mobail;
	}
	public Set<String> getCity() {
		return city;
	}
	public void setCity(Set<String> city) {
		this.city = city;
	}
	public Map<String, String> getCours() {
		return cours;
	}
	public void setCours(Map<String, String> cours) {
		this.cours = cours;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", mobail=" + mobail + ", city=" + city + ", cours=" + cours + "]";
	}
	
}
