package com.qa.main;

public class Main {

	//main method is what runs
	//do not write code in main, link to methods/functions
	public static void main(String[] args) {
		//Code goes here
		
		//not how this should be done
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
		//Calling method - better as this keeps code smaller and more manageable
		newMethod();
		anotherMethod();
		
		//reference the class . the method
		Demo.iAmFirst();
		
		Returns.printHello();
		System.out.println(Returns.returnHello());
		System.out.println(Returns.returnNum());
	}

	//New Method
	//All Methods SHOULD be public static void (this will change)
	public static void newMethod() {
		//Method body - what runs when called in main
		System.out.println("Hello, World! From newMethod();");
	}
	
	public static void anotherMethod() {
		System.out.println("Sup from anotherMethod();");
	}
	
}
