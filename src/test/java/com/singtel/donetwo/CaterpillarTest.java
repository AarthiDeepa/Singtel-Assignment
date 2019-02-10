package com.singtel.donetwo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.singtel.behavior.impl.Insect;
import com.singtel.behavior.impl.insect.Caterpillar;

public class CaterpillarTest {
	Insect caterpillar;
	
	@Before
	public void setUp() throws Exception{
		caterpillar = new Caterpillar(); 
	}

	@Test
	public void walkTest() {
		Assert.assertEquals(true, caterpillar.walk());
	}
	
	@Test
	public void flyTest() {
		Assert.assertEquals(false, caterpillar.fly());
	}

	@Test
	public void singTest() {
		Assert.assertEquals(false, caterpillar.sing());
	}
	
}
