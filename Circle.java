
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
        final double NUM = 2; // 2 as a specific number to calculate
        System.out.println ("This program calculates the areas " +
            "and the perimeters of the excircle and the incircle " +
            "of a given rectangle "); // prints explanation about the program to the user

        System.out.println ("Please enter the two coordinates of the " +
            "left-upper point of the rectangle ");
        int leftUpX = scan.nextInt(); //The user will input x1 of the left point
        int leftUpY = scan.nextInt(); //The user will input y1 of the left point

        System.out.println ("Please enter the two coordinates of the " +
            "right-downer point of the rectangle ");
        int rightDownX = scan.nextInt(); //The user will input x2 of the right point
        int rightDownY = scan.nextInt(); //The user will input y2 of the right point

        double radius = Math.sqrt(Math.pow(leftUpX-rightDownX, NUM)+ 
                Math.pow(leftUpY-rightDownY, NUM)) / NUM ;
        // radius: will be the distance between the points
        double area = Math.PI * Math.pow(radius, NUM);
        // area: Calculate the area of the circle:  π × radius2
        double perimeter = NUM * Math.PI * radius;
        // perimeter: Calculate the perimeter of the circle : 2 × π × radius

        double inCircleRadius = Math.abs(leftUpY-rightDownY) / NUM; 
        // Calculating the Radius of the Incircle 
        double inCircleArea = Math.PI * Math.pow(inCircleRadius, NUM);
        // area: Calculate the area of the Incircle
        double inCirclePerimeter = NUM * Math.PI * inCircleRadius;
        //perimeter: Calculate the perimeter of the circle : 2 × π × radius

        System.out.println ("Incircle: radius = " + inCircleRadius + " area = " +
            inCircleArea + " perimeter = " + inCirclePerimeter); // prints Incircle stats

        System.out.println ("Excircle: radius = " + radius + " area = " +
            area + " perimeter = " + perimeter); // prints Exircle stats

    } // end of mathod main
} // end of class Circle
