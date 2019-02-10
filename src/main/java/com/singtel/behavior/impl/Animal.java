package com.singtel.behavior.impl;

import com.singtel.behavior.AllSpecies;

public abstract class Animal implements AllSpecies {
	@Override
	public boolean walk() {
		System.out.println("Animal is walking");
		return true;
	}
	
	@Override
	public boolean fly() {
		return false;
	}
	
	@Override
	public boolean swim() {
		return false;
	}
}
