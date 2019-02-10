package com.singtel.behavior.impl;

import com.singtel.behavior.SoundingSpecies;

/*
 * Created to support model with Parrot
 */
public class Phone implements SoundingSpecies{

	@Override
	public boolean sing() {
		System.out.println("Tring, tring");
		return true;
	}
	
}
