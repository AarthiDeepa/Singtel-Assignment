package com.singtel.behavior.impl.bird;

import com.singtel.behavior.SoundingSpecies;
import com.singtel.behavior.impl.Bird;

public class Parrot extends Bird{ // use Extends Bird only while count class implementing 
	//Parrot is implemented using Composition "has-a" relationship
	SoundingSpecies sound;
	
	public Parrot(SoundingSpecies sound) {
		this.sound = sound;
	}
	
	public boolean sing() {
		if(sound != null)
			return sound.sing();
		else
			return false;
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
