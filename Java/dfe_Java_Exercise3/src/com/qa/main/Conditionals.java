package com.qa.main;

public class Conditionals {
	//Task- Using If ELSE create an if else stack that does the following
	// prints out greater than if a number is greater than 10
	// prints out equals if a number is equal to 10
	// prints less than if a number is less than 10
	
	public static void ifExercise() {
		int number = 11;
		
		if(number == 10) {
			System.out.println("Number is equal to 10");
		}
		else if(number <= 10) {
			System.out.println("number is less than 10");
		}
		else{
			System.out.println("number is greater than 10");
		}
	}
	
	public static void ifStretch() {
		//set the testing value
		int input = 200;
		
		//start of the character branch
		if(input >= 2000) {
			System.out.println("A");
			
			if(input >= 6000) {
				System.out.println("C");
			}
			else {
				System.out.println("B");
			
				if(input >= 4000) {
					System.out.println("D");
				}
				else {
					System.out.println("E");
				}
			}
		}
		//If the input is less than 2000 follow this branch instead
		else {
			//Start of the branch
			System.out.println("1");
		
			if(input >= 100) {
				System.out.println("3");
				
				if(input >= 600) {
					System.out.println("5");
				}
				else {
					System.out.println("4");
				
					if(input >= 500) {
						System.out.println("6");
					}
					else {
						System.out.println("7");
					}
				}
			}
			else {
				System.out.println("2");
			}
		}
	}
}