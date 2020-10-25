
/**
 * This is class digits.
 *
 * @author (Nadav Chen)
 * @email (nadav2282@gmail..com)
 */
import java.util.Scanner;
public class digits
{
        public static void main (String[ ] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 digits number");
        int userNumber = scan.nextInt();
        int num1 = userNumber%10;
        int num2 = userNumber/10 % 10;
        int num3 = userNumber/100;
        System.out.println(num3);
        System.out.println(num2);
        System.out.println(num1);
        if(num1 != num2)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        System.out.println("price");
        }
        
    }
}
