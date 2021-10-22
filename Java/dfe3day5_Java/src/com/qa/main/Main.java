package com.qa.main;

import com.qa.birds.Chicken;
import com.qa.birds.FlightlessBirds;
import com.qa.birds.PelicanABS;

public class Main {

	public static void main(String[] args) {
		
		// OOP
		FlightlessBirds kiwi = new FlightlessBirds("brown", 3, false, "forest", 12);
		kiwi.makeNoise();
		kiwi.attemptToFly();
		
		System.out.println(kiwi.getFeatherColour());
		
		// Abstraction
		PelicanABS birb = new PelicanABS();
		
		birb.noise();
		birb.sleep();
		
		// Interfaces
		Chicken cluck = new Chicken();
		cluck.laysEgg();
		cluck.eggHatches();
		System.out.println(cluck.laysEgg("Phoenix a la carte!")); //overloaded laysEgg
		
		
	}

}
