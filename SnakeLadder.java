import java.util.Random;
public class SnakeLadder
{
	public static void StartFrom0()
	{
		System.out.println("You are Starting from 0");
	}
	public static int GetRandomNo1To6()
	{
		Random random = new Random();
		int RandonNo1To6 = random.nextInt(6)+1;
		//System.out.println("random number is "+RandonNo1To6);
		return RandonNo1To6;
	}


	public static int GetNoOfTimesDicePlayed_Position()
	{ 

		Random random = new Random();
		int NoOfTimesDicePlayed=0;
		int Win=0;
		while(Win < 100)
		{
			int RandonNo1To6=GetRandomNo1To6();
			int RandomCheck=random.nextInt(3);
			//if player position will go below 0 then player will start from 0

			//when step on snake
			if(RandomCheck == 2 && Win > RandonNo1To6)
			{

				System.out.println("OOPS.. you step on snake you will go "+RandonNo1To6+" step back");
				Win=Win-RandonNo1To6;
				System.out.println("You are in position "+Win);
				System.out.println();
				NoOfTimesDicePlayed++;
			}
			// no move 
			else if(RandomCheck == 0)
			{
				System.out.println("You made a FOUL you scored 0 so you will be in same position");
				System.out.println("You are in position "+Win);
				System.out.println();
				NoOfTimesDicePlayed++;

			}

			else 
			{
				Win=Win+RandonNo1To6;
				//if win exceed 100
				if(Win > 100)
				{
					Win=Win-RandonNo1To6;
					NoOfTimesDicePlayed++;
				}
				else {
					System.out.println("You have scored "+RandonNo1To6);
					System.out.println("CONGRATS... you have incremented by "+RandonNo1To6);
					System.out.println("You are in position "+Win);
					System.out.println();
					NoOfTimesDicePlayed++;
				}
			}
			if(Win == 100)
			{
				System.out.println("CONGRATS YOU HAVE WON THE GAME");
				System.out.println();

			}
		}
		return NoOfTimesDicePlayed;

	}
	public static void main(String[] args)
	{
		StartFrom0();
		System.out.println("..............");
		System.out.println("Total times dice played by you is "+GetNoOfTimesDicePlayed_Position());
		System.out.println();
		System.out.println("Thankyou for playing game...");
	}
}

