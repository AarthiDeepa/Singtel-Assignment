package com.singtel.behavior;

import com.singtel.behavior.impl.Insect;

@FunctionalInterface
public interface MetamorphosisSpecies<T extends Insect> {
	public T metamorphosis();
}
