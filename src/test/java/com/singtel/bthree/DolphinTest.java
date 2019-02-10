package com.singtel.bthree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.singtel.behavior.SwimingSpecies;
import com.singtel.behavior.impl.fish.Dolphin;

public class DolphinTest {
	SwimingSpecies dolphin;
	
	@Before
	public void setUp() throws Exception{
		dolphin = new Dolphin();
	}
	
	@Test
	public void swimTest() {
		Assert.assertEquals(true, dolphin.swim());
	}
	
}
