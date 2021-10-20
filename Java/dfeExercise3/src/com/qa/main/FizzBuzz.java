package com.qa.main;

public class FizzBuzz {

	public FizzBuzz() {
		
		for(int i = 1; i <= 50; i++) {
			//Remember to test the larger value first
			if(i % 5 == 0) {
				if(i % 3 == 0) {
					System.out.println("FizzBuzz");
				}
				else {
					System.out.println("Buzz");
				}				
			}
			
			else if(i % 3 == 0) {
				System.out.println("Fizz");
			}
			else {
				System.out.println(i);
			}
		}
	}
}