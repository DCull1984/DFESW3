package com.qa.birds;

	// we need to specify this as an abstract class
	// public abstract class <class name> - specifies it is an abstract class
public abstract class AbstractBird {
	
	// Abstract classes DON'T have fields
	// Abstract classes shouldn't be something you can create
	// Abstract methods have no body 
	// their only purpose is to make sure child objects use this method
	
	//abstract method, MUST be overloaded in the child
	public abstract void noise();
	
	// Normal method can be called as normal
	public void sleep() {
		System.out.println("zzz zzz zzz");
	}
	
	
}
