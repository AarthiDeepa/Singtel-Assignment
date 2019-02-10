package com.singtel.behavior.impl;

import com.singtel.behavior.AllSpecies;

public abstract class Bird implements AllSpecies{
	@Override
	public boolean sing() {
		System.out.println("I am singing");
		return false;
	}
	
	@Override
	public boolean walk() {
		return true;
	}
}
