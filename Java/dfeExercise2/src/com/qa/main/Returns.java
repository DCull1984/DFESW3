package com.qa.main;

public class Returns {
	private int length;
	private String type;
	private String breed;
	
	//exercise write methods that return 
		//char
		//float
		//boolean
		//double 
		//String
	public static char returnChar() {
		return 'R';
	}
	public static float returnFloat() {
		return 3.141592f;
	}
	public static boolean returnBool() {
		return true;
	}
	public static double returnDouble() {
		return 12.8612235795;
	}
	public static String returnString() {
		return "Hello from the return exercise";
	}
	
	public Returns() {
		length = 8;
		type = "Asp";
		breed = " Snake";				
	}
	@Override
	public String toString() {
		return "I am a " + type + " a member of the " + breed + " race and I am " + length + " feet long";
	}
	
	
}
