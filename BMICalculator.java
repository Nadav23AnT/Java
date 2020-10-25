/**
 * Example of our first lesson
 *
 * @author (Nadav Chen)
 * @email (nadav2282@gmail.com)
 */
import java.util.Scanner;

public class BMICalculator
{
    public static void main (String[ ] args )
    {
        Scanner scan = new Scanner(System.in);
        Double weight, height;
        System.out.println("Please enter your weight");
        weight = scan.nextDouble();
        System.out.println("Please enter your height");
        //Will enter a value to variable hi
        height = scan.nextDouble();
        Double calculatedBmi = weight/Math.pow(height,2);
        System.out.println("your BMI is "+ calculatedBmi);
        
        if(18.5 >= calculatedBmi)
            System.out.println("BMI too skinny is 18.5 and less");
        if(25 <= calculatedBmi)
            System.out.println("BMI over wight is between 25-30");
        if (18.5 <= calculatedBmi && calculatedBmi <= 25.0)
            System.out.println("Perfect!!");
    }
}
