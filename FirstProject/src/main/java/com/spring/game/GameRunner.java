package com.spring.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Lazy
@Scope("prototype")
public class GameRunner {

	private GameConsole gameConsole;

	@Autowired
	public GameRunner(@Qualifier("m") GameConsole gameConsole) {
		System.out.println("Initialization");
		this.gameConsole = gameConsole;
	}

	public void run() {
		gameConsole.up();
		gameConsole.down();
		gameConsole.left();
		gameConsole.right();
	}

}
