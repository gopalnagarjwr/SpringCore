package spring.standalone.collection;

import java.util.List;
import java.util.Map;

public class Persone {
	private List<String> friends;
	private Map<String, String> city;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, String> getCity() {
		return city;
	}

	public void setCity(Map<String, String> city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Persone [friends=" + friends + ", city=" + city + "]";
	}

}
