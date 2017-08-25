import java.util.Random;
import java.util.Scanner;
/**
   This program demonstrates a solution to the
   ESP Game programming challenge.
*/

public class ESPGame
{
   public static void main(String[] args)
   {
	  //TODO: declare relevant variables
	   int correct = 0;
	   
      
      // Play the game for 10 rounds.
      for(int round = 1; round <= 10; round++)
      {
        if (isValidChoice(userChoice()))
        	correct += 1;
        
        System.out.println(10 - round + " more Guesses");
        
		//TODO: Call methods
      }
      
       System.out.println("You guessed " + correct + " correct");                   
      // Exit the program.
      System.exit(0);
   }
   
   /**
      computerChoice method
      @return The computer's choice of "red",
              "green", "blue", "orange", or 
              "yellow".
   */
   
   public static String computerChoice()
   {Random random = new Random();
   int x = random.nextInt(4) + 1;
   
   switch(x)
   
   {case 1:
	   return "Red";
   case 2:
	   return "Green";
   case 3:
	   return "Blue";
   case 4:
	   return "Orange";
   case 5:
	   return "Yellow";
	default:
		return null;
			
   }
	   
    
   
   
   }
   
   /**
      userChoice method
      @return The user's choice of "red",
              "green", "blue", "orange", or 
              "yellow".
   */
   
   public static String userChoice()
   {Scanner keyboard = new Scanner(System.in);
   System.out.println("Please enter one of the following colors: Red, Green, Blue, Orange, or Yellow");
   String a = keyboard.nextLine();
   if (a.equalsIgnoreCase("Blue") == false && a.equalsIgnoreCase("Red") == false && a.equalsIgnoreCase("Green") == false
	  && a.equalsIgnoreCase("Orange") == false  && a.equalsIgnoreCase("Yellow") == false)
	  {System.out.println("Please try again");
      return userChoice();}
   
   
      //TODO: Implement
      
      return a;
   }
   
   /**
      isValidChoice method
      @param choice A string holding the user's choice.
      @return true if the choice is valid, false otherwise.
   */
   
   public static boolean isValidChoice(String a)
   {
      if (a.equalsIgnoreCase(computerChoice()))
      return true;
      else
    	  return false;
   }
}