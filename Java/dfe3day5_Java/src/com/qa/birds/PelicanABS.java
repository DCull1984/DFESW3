package com.qa.birds;

public class PelicanABS extends AbstractBird{

	@Override //must be present when using abstract
	public void noise() {
		System.out.println("WARK!!");
		
	}

}
