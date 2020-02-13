 


/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Craps
{
    public static void giveInstructions(Scanner in)
    {
        System.out.println("Would you like to play craps? [answer y/n]");
        String play = in.nextLine();
        if (play.equals("") || play.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("Do you need instructions? [answer y/n]");
            String instructions = in.nextLine();
            if (instructions.equals("") || instructions.substring(0,1).equalsIgnoreCase("y"))
            {
                System.out.println("1. Roll two six-sided dice and adds the numbers rolled together.");
                System.out.println("2. Get a 7 or 11 on this first roll and you win!");
                System.out.println("3. Get a 2, 3, or 12 on the first roll and you lose!");
                System.out.println("4. Any other number you roll give's you a point!");
                System.out.println("5. If you did not lose on the first roll, keep rolling until you:");
                System.out.println("a) Roll the point again, and win! :)");
                System.out.println("b) Roll a 7, and lose! :(");
            }   
        }
        else
        {
            System.out.println("Okay, bye!");
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Die d1 = new Die();
        Die d2 = new Die();
        System.out.println("The Game of Craps!");
        giveInstructions(in);
        boolean playing = true;
        while (playing)
        {
            System.out.println("Press enter to roll the dice");
            in.nextLine();
            int firstRoll = d1.roll() + d2.roll();
            System.out.println("You rolled " + d1.getResult() + " and " + d2.getResult() + ".");
            if (firstRoll == 7 || firstRoll == 11)
            {
                System.out.println("You win! Congrats!");
            }
            else if (firstRoll == 2 || firstRoll == 3 || firstRoll == 12)
            {
                System.out.println("You lose! ");
            }
            else 
            {
                int point = firstRoll;
                System.out.println("You get a point. Press enter to roll again.");
                int otherRolls = 0;
                while (otherRolls != 7 && otherRolls != point)
                {
                    System.out.println("Press enter to roll:");
                    in.nextLine();
                    otherRolls = d1.roll() + d2.roll();
                    System.out.println("You rolled " + d1.getResult() + " and " + d2.getResult() + ".");
                    if (otherRolls == point)
                    {
                        System.out.println("You win! Congrats!");
                    }
                    else if (otherRolls == 7)
                    {
                        System.out.println("You lose! ");
                    }
                    else
                    {
                        System.out.println("Try again!");
                    }
                }
            }
            System.out.println("Do you want to play again? [answer y/n]");
            String response = in.nextLine();
            if (response.equalsIgnoreCase("n"))
            {
                playing = false;
                System.out.println("Goodbye!");
            }
        }
    }
}
