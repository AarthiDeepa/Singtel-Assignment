package com.singtel.behavior.impl.bird;

import com.singtel.behavior.impl.Bird;
import com.singtel.constant.SpeciesConstant;

/*
 * Modeled a Rooster without using inheritance
 * 
 * Later modified to extend Bird class to support model with Parrot
 */
public class Rooster extends Bird {
	// Rooster is related to chicken using "has-a" relationship
	private Chicken chicken;
	private String gender;
	
	public Rooster(String gender) {
		this.gender = gender;
	}
	
	@Override
	public boolean sing() {
		if(gender.equalsIgnoreCase(SpeciesConstant.FEMALE)) {
			chicken = new Chicken();
			chicken.sing();
		}else
			System.out.println("Cock-a-doodle-doo");
		return true;
	}

	@Override
	public boolean fly() {
		return true;
	}

	@Override
	public boolean swim() {
		return false;
	}
	
}
