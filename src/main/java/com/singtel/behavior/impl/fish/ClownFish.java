package com.singtel.behavior.impl.fish;

import com.singtel.behavior.impl.Fish;
import com.singtel.util.Color;
import com.singtel.util.Size;

public class ClownFish extends Fish{
	
	public ClownFish() {
		this.size = Size.SMALL;
		this.color = Color.ORANGE;
	}

	@Override
	public boolean behavior() {
		System.out.println("Clownfish make jokes");
		return true;
	}
}
