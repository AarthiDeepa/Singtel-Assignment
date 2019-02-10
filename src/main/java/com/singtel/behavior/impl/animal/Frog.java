package com.singtel.behavior.impl.animal;

import com.singtel.behavior.impl.Animal;

public class Frog extends Animal{

	@Override
	public boolean sing() {
		System.out.println("Croak, croak");
		return true;
	}

}
