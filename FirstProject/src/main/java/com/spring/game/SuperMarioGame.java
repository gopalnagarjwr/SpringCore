package com.spring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperMarioGame implements GameConsole {
	public void up() {
		System.out.println("upper... ");
	}

	public void down() {
		System.out.println("niche... ");
	}

	public void left() {
		System.out.println("daye... ");
	}

	public void right() {
		System.out.println("bay... ");
	}
}
