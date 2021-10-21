package com.qa.main;

public class ObjectLesson {
	
	// Fields - attributes to describe the object
	public String flavour;
	public int size;
	public boolean isGlutenFree;
	public String colour;
	
	// Methods - functions the object can do
	public static void eatCake() {
		System.out.println("The cake was delicious! :D");
	}
	
	// Constructor - Constructors are 'methods' to create objects from a class
	// Constructors have NO RETURN (doesn't mean void, means no return)
	
	// Constructor name MUST BE THE CLASS NAME EXACTLY
	public ObjectLesson() {
		flavour = "Vanilla";
		size = 12;
		isGlutenFree = true;
		colour = "Beige";
	}
	
	@Override
	public String toString() {
		return "flavour = " + flavour + ", size = " + size + "cm, isGlutenFree = " + isGlutenFree + ", colour = "
				+ colour;
	}
	
	
}
