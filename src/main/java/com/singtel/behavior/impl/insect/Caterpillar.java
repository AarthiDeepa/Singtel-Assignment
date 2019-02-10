package com.singtel.behavior.impl.insect;

import com.singtel.behavior.MetamorphosisSpecies;
import com.singtel.behavior.impl.Insect;

public class Caterpillar extends Insect implements MetamorphosisSpecies<Chrysalis>{

	@Override
	public boolean fly() {
		System.out.println("Caterpillar cannot fly");
		return false;
	}

	@Override
	public boolean walk() {
		System.out.println("Inside Caterpillar walk function");
		return true;
	}

	@Override
	public Chrysalis metamorphosis() {
		return new Chrysalis(this);
	}

}
