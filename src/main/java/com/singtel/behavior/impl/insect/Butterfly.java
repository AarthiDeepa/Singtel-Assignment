package com.singtel.behavior.impl.insect;

import com.singtel.behavior.impl.Insect;

public class Butterfly extends Insect{

	public Butterfly(Chrysalis chrysalis) {
		// initialize new State transformed from Chrysalis to Butterfly
	}
	
	@Override
	public boolean fly() {
		System.out.println("Butterfly can fly");
		return true;
	}

	@Override
	public boolean walk() {
		return false;
	}

}
