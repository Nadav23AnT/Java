
/**
 * This is class Circle.
 * Calculating Incircle and Excircle Areas / Perimeters by 2 points of a rectangle 
 *
 * @author (Nadav Chen)
 * @email (nadav2282@gmail.com)
 */
import java.util.Scanner;
public class Circle
{
    public static void main (String[ ] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("This program calculates the areas " +
            "and the perimeters of the excircle and the incircle " +
            "of a given rectangle "); // prints explanation about the program to the user

        System.out.println ("Please enter the two coordinates of the " +
            "left-upper point of the rectangle");
        System.out.print("X: ");
        int leftUpX = scan.nextInt(); //The user will input x1 of the left point
        System.out.print("Y: ");
        int leftUpY = scan.nextInt(); //The user will input y1 of the left point

        System.out.println ("Please enter the two coordinates of the " +
            "right-downer point of the rectangle");
        System.out.print("X: ");
        int rightDownX = scan.nextInt(); //The user will input x2 of the right point
        System.out.print("Y: ");
        int rightDownY = scan.nextInt(); //The user will input y2 of the right point

        final double RADIUS = Math.sqrt(Math.pow(leftUpX-rightDownX, 2)+ 
                Math.pow(leftUpY-rightDownY, 2)) / 2 ;
        // radius: will be the distance between the points
        final double AREA = Math.PI * Math.pow(RADIUS, 2);
        // area: Calculate the area of the circle:  π × radius2
        final double PERIMETER = 2 * Math.PI * RADIUS;
        // perimeter: Calculate the perimeter of the circle : 2 × π × radius

        final double IN_CIRCLE_RADIUS = Math.abs(leftUpY-rightDownY) / 2; 
        // Calculating the Radius of the Incircle 
        final double IN_CIRCLE_AREA = Math.PI * Math.pow(IN_CIRCLE_RADIUS, 2);
        // area: Calculate the area of the Incircle
        final double IN_CIRCLE_PERIMETER = 2 * Math.PI * IN_CIRCLE_RADIUS;
        //perimeter: Calculate the perimeter of the circle : 2 × π × radius

        System.out.println ("Incircle: radius = " + IN_CIRCLE_RADIUS + " area = " +
            IN_CIRCLE_AREA + " perimeter = " + IN_CIRCLE_PERIMETER); // prints Incircle stats

        System.out.println ("Excircle: radius = " + RADIUS + " area = " +
            AREA + " perimeter = " + PERIMETER); // prints Exircle stats

    } // end of mathod main
} // end of class Circle
