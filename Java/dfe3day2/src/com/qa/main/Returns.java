package com.qa.main;

public class Returns {
	
	//Methods run blocks of repeatable code
	//Methods run the code until either
		//The body ends
		//The method returns something
	
	public static void printHello() {
		System.out.println("Hello from printHello");
	}
	
	//void = returns nothing
	//Java is explicitly typed
	public static String returnHello() {
		return "Hello from returnHello";
	}
	
	public static int returnNum() {
		return 123;
	}
	
	
}
