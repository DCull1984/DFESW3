package com.qa.main;

public class Conditionals {
	//Conditionals are use when devs want code to have multiple outcomes
	//IF variable is a certain value
	//Do this
	//else do something different
	
	public static void ifDemo() {
		
		//Java uses if-else statements (like every other language)
		//computing and programming is binary
		boolean isKettleOn = true;
		//isKettleOn = false;
		
		//if is the command 
		//next to if is () the statement to test
		if(isKettleOn == true) {
			
			//Method body, code to run if expression is true
			System.out.println("Kettle is on");
			System.out.println("Tea, white, one sugar, thank you :)");
		}
		
		//use else statement is there are only two possible conditions true/false
		//use else if for multiple branches
		else{
			System.out.println("have you tried turning it on?");
		}
		
		boolean binsOut = true;
		//binsOut = false;
		
		//Just use the variable name as auto true
		if(binsOut) {
			System.out.println("bins are out for the bin men");
		}
		else {
			System.out.println("Bins are overflowing");
		}
		
		
	}
}
