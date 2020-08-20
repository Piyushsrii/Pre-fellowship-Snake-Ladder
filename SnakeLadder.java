import java.util.Random;
public class SnakeLadder
   {
     public static void StartFrom0()
    {
     System.out.println("Player Start from 0");
    }
    public static void GetRandomNo1To6()
    {
        Random random = new Random();
	int RandonNo1To6 = random.nextInt(6)+1;
	System.out.println("random number is "+RandonNo1To6);
    }
   }
