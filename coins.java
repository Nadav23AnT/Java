
/**
 * This is class coins.
 *
 * @author (Nadav Chen)
 * @email (nadav2282@gmail..com)
 */
import java.util.Scanner;
public class coins
{
        public static void main (String[ ] args )
    {
        Scanner scan = new Scanner(System.in);
        final int NIS_1=1, NIS_5=5, NIS_10=10;
        System.out.println("Please enter the sum of ILS");
        int sum = scan.nextInt();
        System.out.println("We Need " + (sum/NIS_10) + " coins of 10 NIS");
        System.out.println("We Need " + ((sum%NIS_10)/NIS_5) + " coins of 5 NIS");
        System.out.println("We Need " + (((sum%NIS_10)%NIS_5)/NIS_1) +
        " coins of 1 NIS");
    }
}
