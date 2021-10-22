package com.qa.main;

import com.qa.birds.FlightlessBirds;
import com.qa.birds.PelicanABS;

public class Main {

	public static void main(String[] args) {
		
		FlightlessBirds kiwi = new FlightlessBirds("brown", 3, false, "forest", 12);
		kiwi.makeNoise();
		kiwi.attemptToFly();
		
		System.out.println(kiwi.getFeatherColour());
		
		PelicanABS birb = new PelicanABS();
		
		birb.noise();
		birb.sleep();
		
	}

}
