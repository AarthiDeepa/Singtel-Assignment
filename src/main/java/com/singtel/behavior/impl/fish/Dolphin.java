package com.singtel.behavior.impl.fish;

import com.singtel.behavior.SwimingSpecies;

public class Dolphin implements SwimingSpecies{

	@Override
	public boolean swim() {
		System.out.println("Dolphin is swimming");
		return true;
	}
	
}
