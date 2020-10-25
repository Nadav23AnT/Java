
/**
 * This is class switch_test.
 *
 * @author (Nadav Chen)
 * @email (nadav2282@gmail..com)
 */
import java.util.Scanner;
public class switch_test
{
    public static void main (String[ ] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan.nextInt(); // Input num
        //num=(num == 1 || num == 2)? num+1: num; // if 1<=num<=2, num + 1 = num
        switch (num){ // Open switch  
            case 1:
            case 2: num+=1; break;
            case 3:
            case 4:
            case 5: num-=1; break;
            case 6: num*=2; break;
            default: num*=3;
        }// End of switch
        System.out.println("The number now is " + num);
    }
}