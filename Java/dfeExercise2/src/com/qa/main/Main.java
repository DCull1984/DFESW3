package com.qa.main;

public class Main {

	public static void main(String[] args) {
		//Exercise 2, Calling methods from another Class
		Demo.pizzaTopping();
		Demo.aWord();
		Demo.aNumber();
		
		//Blank spacing
		System.out.println();
		
		//return exercise
		System.out.println(Returns.returnChar());
		System.out.println(Returns.returnFloat());
		System.out.println(Returns.returnBool());
		System.out.println(Returns.returnDouble());
		System.out.println(Returns.returnString());
		
		//Blank spacing
		System.out.println();
		
		//Stretch target, print out an object
		Returns snake = new Returns();
		System.out.println(snake);
	}

}
