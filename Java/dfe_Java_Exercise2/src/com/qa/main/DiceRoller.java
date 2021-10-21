package com.qa.main;

import java.util.Random;

public class DiceRoller {
	//Exercise using Random
	//create methods that return the following dice rolls
		//3 sided dice
		//4 sided dice
		//6 sided dice
		//8 sided dice
		//10 sided dice
	//create methods that do the following
		//sum of 4 six sided dice
		//sum of 2 ten sided dice and 2 three sided dice
		//sum of 1 of each dice
		
	//stretch goal
		//sum of 4 six sided dice ignoring the smallest value
	
	public static int threeSidedDice(){
		int threeSides = new Random().nextInt(3)+1;
		return threeSides;
	}
	public static int fourSidedDice(){
		int fourSides = new Random().nextInt(4)+1;
		return fourSides;
	}
	public static int sixSidedDice(){
		int sixSides = new Random().nextInt(6)+1;
		return sixSides;
	}
	public static int eightSidedDice(){
		int eightSides = new Random().nextInt(8)+1;
		return eightSides;
	}
	public static int tenSidedDice(){
		int tenSides = new Random().nextInt(10)+1;
		return tenSides;
	}
//	public static int addSix(int sixSidedDie) {
//		int resultArray[];
//		int sum;
//		for(int i = 0; i < 4; i++) {
//			int result = sixSidedDie;
//			resultArray[i] = result;
//			sum += resultArray[i];
//		}
//		return sum;
//	}
}
