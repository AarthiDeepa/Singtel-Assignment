package com.singtel.donetwo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.singtel.behavior.impl.Insect;
import com.singtel.behavior.impl.insect.Butterfly;
import com.singtel.behavior.impl.insect.Caterpillar;
import com.singtel.behavior.impl.insect.Chrysalis;

public class ButterflyTest {
	Insect butterfly;
	
	@Before
	public void setUp() throws Exception{
		Caterpillar caterpillar = new Caterpillar(); 
		butterfly = new Butterfly(new Chrysalis(caterpillar));
	}
	
	@Test
	public void flyTest() {
		Assert.assertEquals(true, butterfly.fly());
	}

	@Test
	public void singTest() {
		Assert.assertEquals(false, butterfly.sing());
	}
	
	@Test
	public void walkTest() {
		Assert.assertEquals(false, butterfly.walk());
	}
}
