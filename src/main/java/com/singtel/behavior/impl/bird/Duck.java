package com.singtel.behavior.impl.bird;

import com.singtel.behavior.impl.Bird;

public class Duck extends Bird{
	@Override
	public boolean sing() {
		System.out.println("Quack, quack");
		return true;
	}
	
	@Override
	public boolean swim() {
		System.out.println("Duck is swimming");
		return true;
	}
	
	@Override
	public boolean fly() {
		return true;
	}

}
