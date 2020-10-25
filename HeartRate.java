
/**
 * This is class HeartRate.
 *
 * @author (Nadav Chen)
 * @email (nadav2282@gmail.com)
 */
import java.util.Scanner;
public class HeartRate
{
    public static void main (String[ ] args )
    {
        final int CONST = 220; // CONST - age of the user = Suggested heart-rate
        Scanner scan = new Scanner (System.in);
        System.out.println ("This program calculates your " +
            "target heart rate while exercising "); // Explanation about the program to the user

        System.out.print ("Enter your age: ");
        int age = scan.nextInt(); // User input his age
        
        final int HIGH_LIMIT = (int)((CONST - age) * 0.85); // Calculate the high limit of the HeartReate
        final int LOW_LIMIT = (int)((CONST - age) * 0.65); // Calculate the low limit of the HeartReate
        
        System.out.println("Your estimated target heart rate zone is "+ LOW_LIMIT + "-" + HIGH_LIMIT + " beats per minute"); 
        //Prints the output(result) to the user

    } // End of method main
} // End of class HeartRate
