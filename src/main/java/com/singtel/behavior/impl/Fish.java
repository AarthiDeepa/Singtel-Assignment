package com.singtel.behavior.impl;

import com.singtel.behavior.AllSpecies;
import com.singtel.behavior.BehaviorSpecies;
import com.singtel.util.Color;
import com.singtel.util.Size;

public abstract class Fish implements AllSpecies, BehaviorSpecies{

	protected Size size;
	protected Color color;
	
	@Override
	public boolean swim() {
		System.out.println("I am swimming");
		return true;
	}

	@Override
	public boolean fly() {
		return false;
	}
	
	@Override
	public boolean walk() {
		return false;
	}
	
	@Override
	public boolean sing() {
		return false;
	}
	
	public Size getSize() {
		return size;
	}

	public Color getColor() {
		return color;
	}

}
