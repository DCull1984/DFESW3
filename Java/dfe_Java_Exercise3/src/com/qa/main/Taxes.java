package com.qa.main;

public class Taxes {
	//Stretch Goal exercise
	public static void taxExercise(int salary) {
		if(salary < 45000) {
			//work backwards from the largest amount
			if(salary >= 30000 && salary < 45000) {
				System.out.println("Taxable amount is : 20%");
			}
			else if(salary >= 20000 && salary < 30000) {
				System.out.println("Taxable amonut is: 15%");
			}
			else if(salary >= 15000 && salary < 20000) {
				System.out.println("Taxable amount is: 10%");
			}
			else {
				System.out.println("Taxable amount is: 0%");
			}
		}
		else {
			System.out.println("Taxable amount is: 25%");
		}
	}
}
