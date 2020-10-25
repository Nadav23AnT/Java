
/**
 * This is class age.
 *
 * @author (Nadav Chen)
 * @email (nadav2282@gmail..com)
 */
import java.util.Scanner;
public class age
{
        public static void main (String[ ] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age= scan.nextInt();
        System.out.println("Enter your salary:");
        Double salary= scan.nextDouble();
        if (18 < age && age < 67)
            salary-=100;
        else
            salary+=200;
        System.out.println("Your updated salary:" + salary);
    }
}
