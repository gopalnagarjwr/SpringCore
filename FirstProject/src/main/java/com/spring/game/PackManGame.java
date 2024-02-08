package com.spring.game;

import javax.naming.Name;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PackManGame implements GameConsole {
	public void up() {
		System.out.println("top... ");
	}

	public void down() {
		System.out.println("bottum... ");
	}

	public void left() {
		System.out.println("left-Side... ");
	}

	public void right() {
		System.out.println("right-Side... ");
	}
}
