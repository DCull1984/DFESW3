package com.qa.main;

public class BlackJack {
	
	public static void blackJack(int a, int b)
	{
		if(a == b) {
			
			if (a <= 21 && b <= 21) {
				if(a == 21 && b == 21) {
					System.out.println("House Rules, Player 2 wins");
				}
				else {
					System.out.println("It's a Draw");
				}
				
			}
			else {
				System.out.println("Both Players Bust!");
			}
		}
//************************************************************************************************************//		
		else if (a > b)
		{
			if (a >= 22)
			{
				System.out.println("Player 2 Wins");
			}
			System.out.println("Player 1 Wins");
		}
//*************************************************************************************************************//		
		else if (a < b)
		{
			if (b >= 22)
			{
				System.out.println("Player 1 Wins");
			}
			System.out.println("Player 2 Wins");
		}
//*************************************************************************************************************//			
		else
		{
			System.out.println("Error in here somewhere, please check :P");
		}
				
	}
}
