import java.util.Random;
public class SnakeLadder
{
	public static void startFrom0()
	{
		System.out.println("You are Starting from 0");
	}
	public static int getRandomNo1To6()
	{
		Random random = new Random();
		int randonNo1To6 = random.nextInt(6)+1;
		//System.out.println("random number is "+RandonNo1To6);
		return randonNo1To6;
	}


	public static int getNoOfTimesDicePlayed_Position()
	{ 

		Random random = new Random();
		int noOfTimesDicePlayed=0;
		int Win = 0;
		while(Win < 100)
		{
			int randonNo1To6 = getRandomNo1To6();
			int randomCheck = random.nextInt(3);
			//if player position will go below 0 then player will start from 0

			//when step on snake
			if(randomCheck == 2 && Win > randonNo1To6)
			{

				System.out.println("OOPS.. you step on snake you will go "+randonNo1To6+" step back");
				Win = Win-randonNo1To6;
				System.out.println("You are in position "+Win);
				System.out.println();
				noOfTimesDicePlayed++;
			}
			// no move 
			else if(randomCheck == 0)
			{
				System.out.println("You made a FOUL you scored 0 so you will be in same position");
				System.out.println("You are in position "+Win);
				System.out.println();
				noOfTimesDicePlayed++;

			}

			else 
			{
				Win = Win+randonNo1To6;
				//if win exceed 100
				if(Win > 100)
				{
					Win = Win-randonNo1To6;
					noOfTimesDicePlayed++;
				}
				else {
					System.out.println("You have scored "+randonNo1To6);
					System.out.println("CONGRATS... you have incremented by "+randonNo1To6);
					System.out.println("You are in position "+Win);
					System.out.println();
					noOfTimesDicePlayed++;
				}
			}
			if(Win == 100)
			{
				System.out.println("CONGRATS YOU HAVE WON THE GAME");
				System.out.println();

			}
		}
		return noOfTimesDicePlayed;

	}
	public static void main(String[] args)
	{
		startFrom0();
		System.out.println("..............");
		System.out.println("Total times dice played by you is "+getNoOfTimesDicePlayed_Position());
		System.out.println();
		System.out.println("Thankyou for playing game...");
	}
}

