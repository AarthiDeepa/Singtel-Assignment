package com.singtel.behavior.impl.bird;

import com.singtel.constant.SpeciesConstant;

/*
 * Modeled a Rooster without using inheritance
 * 
 */
public class Rooster {
	// Rooster is related to chicken using composition "has-a" relationship
	private Chicken chicken;
	private String gender;
	
	public Rooster(String gender) {
		this.gender = gender;
	}
	
	public boolean sing() {
		if(gender.equalsIgnoreCase(SpeciesConstant.FEMALE)) {
			chicken = new Chicken();
			chicken.sing();
		}else
			System.out.println("Cock-a-doodle-doo");
		return true;
	}

}
