package com.qa.main;

public class ArrayExercise {
	
	//create an array of number 1 - 10
	public static int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	public static int[] secondArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
	
	public static void numArrayExercise() {
		
		//print out the number*2 (2->4, 3->6, 4->8)
		for(int i = 0; i < numArray.length; i++ ) {
			System.out.println("Number at: " + i + " is: " + numArray[i] + " Multiplied by 2 is: " + numArray[i] * 2);
			System.out.println("********************************************");
		}
		
		System.out.println();
		System.out.println();
		// print out the squared value of each of the numbers
		// (2->4, 3->9 etc)
		for(int i = 0; i < numArray.length; i++ ) {
			System.out.println("Number at: " + i + " is: " + numArray[i] + " Squared is: " + numArray[i] * numArray[i]);
			System.out.println("*************************************");
		}
		
		System.out.println();
		System.out.println();
		
		//have a second array created with 10 numbers
		//when you square the number from the first array
		//modify the second array to have the squared number
		for(int i = 0; i < numArray.length; i++ ) {
			secondArray[i] = numArray[i] * numArray[i];
			System.out.println("Number at: " + i + " is: " + numArray[i] + " Squared is: " + secondArray[i] );
			System.out.println("*************************************");
	
		}
		
		System.out.println();
		System.out.println();
		// print out the power of value of each of the numbers
		// (2->4, 3->9 etc)
		for(int i = 0; i < numArray.length; i++ ) {
			System.out.println("Number at: " + i + " is: " + numArray[i] + " Powered is: " + Math.pow(numArray[i],numArray[i]));
			System.out.println("*************************************");
		}		
	}
	
	
}
