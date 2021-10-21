package com.qa.main;

public class Calculator {
	//Exercise to create a calculator with the methods
	 	//add
		//subtract
		//multiply
		//divide
	public static int addNum(int num1, int num2) {
		return num1 + num2;
	}
	public static int subtractNum(int num1, int num2) {
		return num1 - num2;
	}
	public static int multiplyNum(int num1, int num2) {
		return num1 * num2;
	}
	public static float divideNum(float num1, float num2) {
		return num1 / num2;
	}
	//Stretch goal multiply to the power of
	public static int powerOfNum(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}
}
