package com.qa.main;

public class ArraysDemo {
	//arrays within Java are collections of data
	//arrays can only contain one data type Strings, int's, booleans, objects
	//arrays are immutable - can't be changed once created
	
	//arrays in Java = Train, can change customers getting on and off
	//but you can't change the length of the train or type of cargo mid journey
	public static String[] colourList = {"blue", "purple", "teal", "cyan", "red"};
	public static void arrayDemo() {
		//when creating arrays you need to use [] to denote its an array
		String colour = "green";
		
		
		System.out.println(colour);
		System.out.println("============================");
		System.out.println(colourList);
		
		//for loop to access our colours
		//accessing the length of our array with .length
		for(int i = 0; i < colourList.length; i++) {
			System.out.println("=========================");
			System.out.println(colourList[i]);
		}
		
		//how to manipulate our values
		//colourList[1] = Purple
		colourList[1] = "moave";
		System.out.println("=========================");
		System.out.println(colourList[1]);
	}
	
	public static void foreachArray() {
		//for each string in the array colourList
		//create a temp variable called colour that is equal to it
		for(String colour : colourList) {
			System.out.println(colour);
		}
	}
}
