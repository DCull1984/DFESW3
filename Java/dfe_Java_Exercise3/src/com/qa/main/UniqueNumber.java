package com.qa.main;

public class UniqueNumber {

	public static int totalSum(int a, int b , int c) {
		
		if(a == b && b == c ) {
			return 0;
		}
		else {
			return a + b + c;
		}
	}
}
