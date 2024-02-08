package com.spring;

import org.springframework.boot.SpringApplication;

import com.spring.game.GameConsole;
import com.spring.game.GameRunner;
import com.spring.game.JavaConfig;
import com.spring.game.Mario;
import com.spring.game.PackManGame;
import com.spring.game.SuperMarioGame;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		
		var context=new AnnotationConfigApplicationContext(JavaConfig.class);		 
		GameRunner gameRunner = context.getBean(GameRunner.class);
		GameRunner gameRunner1 = context.getBean(GameRunner.class);
		GameRunner gameRunner2 = context.getBean(GameRunner.class);
		System.out.println(gameRunner.hashCode());
		System.out.println(gameRunner1.hashCode());
		System.out.println(gameRunner2.hashCode());
		gameRunner.run();
	}

}
