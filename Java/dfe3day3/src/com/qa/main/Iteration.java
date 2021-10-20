package com.qa.main;

public class Iteration {
	//iteration allows you to repeat code UNTIL a a condition is met
	//within Java there are 4 basic types of loops
	
	// while - run until condition is met
	// do while - runs once, then checks the conditional
	
	// for - run a predetermined (numerically) amount of iterations
	
	//if you know how long the loop should run -> for loop
	//if not use a while/do-while loop
	
	// switch - in-between conditionals and loops, replaces a nesting if-else statement and loops the code
	
	public static void basicDemo() {
		int counter = 0;
		
		while(counter <= 10) {
			System.out.println("Counter Value: " + counter);
			counter++; //without incrementation loop will run indefinitely
		}
	}
	
	public static void doWhileDemo() {
		int counter = 0;
		
		//will always run once, BEFORE checking condition
		do {
			if(counter == 0) {
				System.out.println("first run");
			}
			else {
				System.out.println("after initial run");
			}
			counter++;
		}
		while(counter < 3);
	}
	
	public static void forLoop() {
		//For loops primarily work with numerical values
		//they will run for a set number of times, based on how they've been configured
		
		//for loops four components to configure
		//initialisation (initial value)
		//condition (what we're checking for)
		//iteration (how we loop through the code)
		//body (what we're looping)
		
		//For loop counting to 10
		for(int index = 0; //initialisation - start from the value 0
				index <= 10; //condition - do this while index is less than 10
				index++ //Iterator -we're adding 1 to index after each iteration
				) {
			System.out.println("For loop count: " + index);
		}
		
		
	}
}
