package com.qa.main;

public class Main {

	public static void main(String[] args) {
		Conditionals.ifExercise();
		Conditionals.ifStretch();
		
		System.out.println("**********************************************************************");
		
		System.out.println(BlackJack.blackJack(19, 17));

		System.out.println("**********************************************************************");
		
		new FizzBuzz();
		
		System.out.println("**********************************************************************");
		
		System.out.println(UniqueNumber.totalSum(1, 1, 2));
	}

}
