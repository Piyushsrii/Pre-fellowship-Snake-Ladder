import java.util.Random;
public class SnakeLadder
{
	public static void StartFrom0()
	{
		System.out.println("Player Start from 0");
	}
	public static int GetRandomNo1To6()
	{
		Random random = new Random();
		int RandonNo1To6 = random.nextInt(6)+1;
		//System.out.println("random number is "+RandonNo1To6);
		return RandonNo1To6;
	}


	public static void RepeteTillPlayerReachExact100()
	{ 

		Random random = new Random();
		int Win=0;
                //to repeat till 100
		while(Win < 100)
		{
			int RandonNo1To6=GetRandomNo1To6();
			int RandomCheck=random.nextInt(3);
			if(RandomCheck == 2 && Win > RandonNo1To6)
			{

				System.out.println("oops you step on snake you will go "+RandonNo1To6+" step back");
				Win=Win-RandonNo1To6;
				System.out.println("you are in "+Win);

			}
			else if(RandomCheck == 0)
			{
				System.out.println("you made a foult you scored 0 so you will be in same position");
				System.out.println("you are in "+Win);

			}
			else 
			{
				Win=Win+RandonNo1To6;
                                //to stop player exact in 100
				if(Win > 100)
				{
					Win=Win-RandonNo1To6;
				}
				else 
                                {
					System.out.println("congrats you have incremented by "+RandonNo1To6);
					System.out.println("you are in "+Win);
				}
			}
			if(Win == 100)
			{
				System.out.println("congrats you have reached till 100");

			}
		}


	}
	public static void main(String[] args)
	{
		StartFrom0();
		System.out.println("..............");

		RepeteTillPlayerReachExact100();
	}
}

