package com.spring.PostConstruct_PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class Dependency1 {
}

//@Component
@Named
class Dependency2 {
}

@Component
class Service {
	Dependency1 d1;

	Dependency2 d2;

	@Inject
	public Service(Dependency1 d1, Dependency2 d2) {
		System.out.println("by constructor initialization... ");
		this.d1 = d1;
		this.d2 = d2;
	}

	public Service() {
	 
	}

	// @Autowired
	public void setD1(Dependency1 d1) {
		this.d1 = d1;
	}

//	@Autowired
	public void setD2(Dependency2 d2) {
		this.d2 = d2;
	}

	@Override
	public String toString() {
		return "Service [d1=" + d1 + ", d2=" + d2 + "]";
	}

	@PostConstruct
	public void PostConstruct() {
		System.out.println("this is Post Construct Method ");
	}

	@PreDestroy
	public void PreDestroy() {
		System.out.println("this is PreDestroy Method");
	}
}

@Configuration
@ComponentScan
public class Main {

	public static void main(String[] args) {
		var Context = new AnnotationConfigApplicationContext(Main.class);
		Service bean = Context.getBean(Service.class);
		System.out.println(bean);
		Context.close();

	}
}