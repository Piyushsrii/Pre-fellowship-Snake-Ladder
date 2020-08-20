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
		System.out.println("random number is "+RandonNo1To6);
		return RandonNo1To6;
	}

         
	public static void CheckSnake_Ladder_Noplay()
	{ 
         int RandonNo1To6=GetRandomNo1To6();
         Random random = new Random();
         int RandomCheck=random.nextInt(3);
         	if(RandomCheck == 2)
			{
				System.out.println("oops you step on snake you will got 2 step back");
			}
			else if(RandomCheck == 0)
			{
				System.out.println("you made a foult so you will be in same position");
			}
			else
				System.out.println("congrats you have incremented by "+RandonNo1To6);

        }

	public static void main(String[] args)
	{
		StartFrom0();
		System.out.println(GetRandomNo1To6());
		CheckSnake_Ladder_Noplay();
	}
 }
