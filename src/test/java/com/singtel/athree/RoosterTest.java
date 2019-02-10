package com.singtel.athree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.singtel.behavior.impl.bird.Rooster;

public class RoosterTest {
	Rooster rooster;
	
	@Before
	public void setUp() throws Exception{
		rooster = new Rooster("");
	}
	
	@Test
	public void singRoosterTest() {
		rooster = new Rooster("male");
		Assert.assertEquals(true, rooster.sing());
	}
	
	@Test
	public void singChickenTest() {
		rooster = new Rooster("female");
		Assert.assertEquals(true, rooster.sing());
	}
	
}
