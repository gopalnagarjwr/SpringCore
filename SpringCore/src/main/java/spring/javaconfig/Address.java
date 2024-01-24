package spring.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	@Value("jaipur")
	private String city;
	@Value("302033")
	private int pin;

	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}

}
