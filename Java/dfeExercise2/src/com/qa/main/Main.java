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
		
		//Blank spacing
		System.out.println();
		
		//Exercise for operator use
		System.out.println(Calculator.addNum(3, 9));
		System.out.println(Calculator.subtractNum(54, 18));
		System.out.println(Calculator.multiplyNum(20, 15));
		System.out.println(Calculator.divideNum(15, 3));
		
		//stretch goal for operator use, multiply to the power
		System.out.println(Calculator.powerOfNum(2, 10));
		
		//Blank spacing
		System.out.println();
		
		//First part of dice exercise
		System.out.println(DiceRoller.threeSidedDice());
		System.out.println(DiceRoller.fourSidedDice());
		System.out.println(DiceRoller.sixSidedDice());
		System.out.println(DiceRoller.eightSidedDice());
		System.out.println(DiceRoller.tenSidedDice());
		
		//Second part of dice exercise adding dice together
		//System.out.println(DiceRoller.addSix(DiceRoller.sixSidedDice()));
	}

}
