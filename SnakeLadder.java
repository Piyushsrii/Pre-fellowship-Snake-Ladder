import java.util.Random;

public class SnakeLadder
{
	static Random random = new Random();
	static int player1Position = 0;
	static int player2Position = 0;
	static int p1noOfTimesDicePlayed=0;
	static int p2noOfTimesDicePlayed=0;
	//to display welcome message
	public static void StartFrom0()
	{
		System.out.println("Player 1 Starting from 0");
		System.out.println("Player 2 Starting from 0");
		System.out.println("--------------------------");
	}
	//to get random number 1 to 6
	public static int getRandomNo1To6()
	{

		int randonNo1To6 = random.nextInt(6)+1;
		return randonNo1To6;
	}
	//to get option 0, 1 or 2
	public static int getOption()
	{
		int option = random.nextInt(3);
		return option;
	}

	public static void playPlayer1Player2()
	{
		int count = 0;
		player1Position = 0;
		player2Position = 0;
		while(player1Position < 100 && player2Position < 100 )
		{

			int randomNo1to6 = getRandomNo1To6();
			int option=getOption();
			if(count%2==0)//alternating playing
			{
				count++;
				p1noOfTimesDicePlayed++;
				if(option == 0)
				{
					System.out.println("player1 scored "+randomNo1to6);
					System.out.println("player1 option is 0 he will stay in same position");
					System.out.println("player1 is in position "+player1Position);
					System.out.println();
				}

				else if(option == 1 && player1Position > randomNo1to6)//should not go to negative
				{ 
					System.out.println("player1 scored "+randomNo1to6);
					System.out.println("player1 step on snake  he will go back by "+randomNo1to6);
					player1Position = player1Position-randomNo1to6;
					System.out.println("player1 is in position "+player1Position);
					System.out.println();
				}

				else
				{
					player1Position = player1Position+randomNo1to6;
					if(player1Position > 100)//should not go above 100
					{
						player1Position = player1Position-randomNo1to6;
						System.out.println("player1 scored "+randomNo1to6);
						System.out.println("player 1 has missed his turn he need "+(100-player1Position)+" to win");
						System.out.println();
					}
					else
					{
						System.out.println("player1 scored "+randomNo1to6);
						System.out.println("player1 is incremented by "+randomNo1to6);
						System.out.println("p1 are in position "+player1Position);
						System.out.println();
					}
				}

				if(player1Position == 100)
				{
					System.out.println("CONGRATS... player 1 has won the game");
					System.out.println("total no of time dice played by him is "+p1noOfTimesDicePlayed);
				}

			}

			else
			{
				count++;
				p2noOfTimesDicePlayed++;
				if(option == 0)
				{
					System.out.println("player2 scored "+randomNo1to6);
					System.out.println("player2 option is 0 he will stay in same position");
					System.out.println("player2 is in position "+player2Position);
					System.out.println();
				}

				else if(option == 1 && player2Position > randomNo1to6)
				{
					System.out.println("player2 scored "+randomNo1to6);
					System.out.println("player2 step on snake he will go back by "+randomNo1to6);
					player2Position = player2Position-randomNo1to6;
					System.out.println("player2 is in position "+player2Position);
					System.out.println();
				}

				else
				{   
					player2Position = player2Position+randomNo1to6;
					if(player2Position > 100)
					{
						player2Position = player2Position-randomNo1to6;
						System.out.println("player2 scored "+randomNo1to6);
						System.out.println("player 2 has missed his turn he need "+(100-player2Position)+" to win");
						System.out.println();
					}
					else
					{
						System.out.println("player2 scored "+randomNo1to6);
						System.out.println("player2 are incremented by "+randomNo1to6);
						System.out.println("player2 is in position "+player2Position);
						System.out.println();
					}
				}
				if(player2Position == 100)
				{
					System.out.println("CONGRATS... player 2 has won the game");
					System.out.println("total no of time dice played by him is "+p2noOfTimesDicePlayed);
				}
			}


		}


	}

	public static void main(String[] args)
	{
		StartFrom0();
		playPlayer1Player2();	
	}
}

