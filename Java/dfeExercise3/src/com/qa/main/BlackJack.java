package com.qa.main;

public class BlackJack {
	
	public static int blackJack(int a, int b)
	{
		if(a == b) {
			if (a <= 21 && b <= 21) {
				System.out.println("It's a Draw");
				return 0;
			}
			else {
				System.out.println("Both Players Bust!");
				return -1;
			}
		}
		
		else if (a > b)
		{
			if (a >= 22)
			{
				System.out.println("Player 2 Wins");
				return b;
			}
			System.out.println("Player 1 Wins");
			return a;
		}
		
		else if (a < b)
		{
			if (b >= 22)
			{
				System.out.println("Player 1 Wins");
				return a;
			}
			System.out.println("Player 2 Wins");
			return b;
		}
		
		else
		{
			return -1;
		}
				
	}
}
