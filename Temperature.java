/**
 * This is class Temperature.
 *
 * @author (Nadav Chen)
 * @email (nadav2282@gmail.com)
 */
import java.util.Scanner;
public class Temperature
{
    public static void main (String[ ] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What are the units of measure and what value?"); 
        System.out.println("C / F / K?");// Asking the user to input info he wants to calculate
        String input = scan.next();
        char measure = input.charAt(0); // Input - the measure C / F / K
        double temperature = scan.nextInt(); // input - the value of the the measure
        final double NUM1 = 5/9.0, NUM2 = 9/5.0, NUM3 = 32.0;
        final double NUM4= 273.15; // Numbers to calculate the measuers

        if (measure == 'C' ){ // If users input equals to "C" as Celsius
            final double CELSIUS_TO_FAHARENHEIT = temperature * NUM2 + NUM3; 
            // calculating Celsius to Faharenheit
            final double CELSIUS_TO_KELVIN = temperature + NUM4; 
            // Calculating Celsius to kelvin

            System.out.println(temperature + " C"); // Prints Celsius value
            System.out.println(CELSIUS_TO_FAHARENHEIT + " F"); // Prints Faharenheit value
            System.out.println(CELSIUS_TO_KELVIN + " K"); // Prints Kelvin value
        }
        else{
            if(measure == 'F'){ // If users input equals to "F" as Faharenheit
                final double FAHARENHEIT_TO_CELSIUS = (temperature - NUM3) * NUM1 ; 
                // Calculating Faharenheit to Celsius
                final double FAHARENHEIT_TO_KELVIN = (temperature - NUM3) * NUM1 + NUM4; 
                // Calculating Faharenheit to Kelvin

                System.out.println(FAHARENHEIT_TO_CELSIUS + " C"); // Prints Celsius value
                System.out.println(temperature + " F"); // Prints Faharenheit value
                System.out.println(FAHARENHEIT_TO_KELVIN + " K"); // Prints Kelvin value
            }
            else
            if(measure == 'K'){ // If users input equals to "K" as Kelvin
                final double KELVIN_TO_FAHARENHEIT = (temperature - NUM4) * NUM2 + NUM3; // Calculating Kelvin to Faharenheit
                final double KELVIN_TO_CELSIUS = temperature - NUM4; // Calculating Kelvin to Celsius

                System.out.println(KELVIN_TO_CELSIUS + " C"); // Prints Celsius value
                System.out.println(KELVIN_TO_FAHARENHEIT + " F"); // Prints Faharenheit value
                System.out.println(temperature + " K"); // Prints Kelvin value
            }
            else
                System.out.println("Error!");
        } // end of mathod switch
    } // end of mathod main
} // end of class Temperature
//**