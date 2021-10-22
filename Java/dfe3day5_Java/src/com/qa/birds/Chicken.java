package com.qa.birds;

import com.qa.interfaces.LayEggs;

//to give interfaces to classes we use implements
public class Chicken implements LayEggs {

	@Override
	public void laysEgg() {
		System.out.println("Lays an egg!");
		
	}

	@Override
	public void eggHatches() {
		System.out.println("egg hatches");
	}

	@Override
	public String laysEgg(String eggName) {
		return eggName;
	}

}
