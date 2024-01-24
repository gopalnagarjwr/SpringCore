package spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan(basePackages ="spring.javaconfig" )
public class JavaConfig {
	
	@Bean
	public Address getAdd() {
		return new Address();
	}
    
	@Bean(name={"newUser","new"})
	 public User getUser(){
		 return new User(getAdd());
	 }
	
}
