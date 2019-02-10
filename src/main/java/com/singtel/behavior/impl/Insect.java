package com.singtel.behavior.impl;

import com.singtel.behavior.AllSpecies;

public abstract class Insect implements AllSpecies{
	@Override
	public boolean sing() {
		return false;
	}
	
	@Override
	public boolean swim() {
		return false;
	}
}
