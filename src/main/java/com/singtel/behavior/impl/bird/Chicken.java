package com.singtel.behavior.impl.bird;

import com.singtel.behavior.impl.Bird;

public class Chicken extends Bird{
	@Override
	public boolean sing() {
		System.out.println("Cluck, cluck");
		return true;
	}
	
	@Override
	public boolean fly() {
		System.out.println("Chicken cannot fly because my wings are clipped");
		return false;
	}

	@Override
	public boolean swim() {
		return false;
	}

}

