
/**
 * This is class Congruent.
 * Made to calculate whether two triangles are equal by specifying their coordinates
 *
 * @author (Nadav Chen)
 * @email (nadav2282@gmail.com)
 */
import java.util.Scanner;
public class Congruent
{
    public static void main (String[ ] args )
    {
        Scanner scan = new Scanner(System.in);
        double X1, Y1, X2, Y2, X3, Y3;
        System.out.println("Please enter 3 coordinates of the first triangular:"); 
        X1 = scan.nextDouble(); // Input x1 of his first triangular
        Y1 = scan.nextDouble(); // Input y1 of his first triangular
        X2 = scan.nextDouble(); // Input x2 of his first triangular
        Y2 = scan.nextDouble(); // Input y2 of his first triangular
        X3 = scan.nextDouble(); // Input x3 of his first triangular
        Y3 = scan.nextDouble(); // Input y3 of his first triangular

        double triangularRib1 =  Math.sqrt(Math.pow(X1-X2, 2) + Math.pow(Y1-Y2, 2)) / 2; 
        // will be the distance between the point 1 - 2
        double triangularRib2 =  Math.sqrt(Math.pow(X2-X3, 2)+ 
                Math.pow(Y2-Y3, 2)) / 2; 
        // will be the distance between the point 2 -3
        double triangularRib3 =  Math.sqrt(Math.pow(X1-X3, 2) + Math.pow(Y1-Y3, 2)) / 2; 
        // will be the distance between the point 3 - 1 

        System.out.println("Please enter 3 coordinates of the second triangular:"); 
        double X4 = scan.nextDouble(); // Input x1 of his second triangular
        double Y4 = scan.nextDouble(); // Input y1 of his second triangular
        double X5 = scan.nextDouble(); // Input x2 of his second triangular
        double Y5 = scan.nextDouble(); // Input y2 of his second triangular
        double X6 = scan.nextDouble(); // Input x3 of his second triangular
        double Y6 = scan.nextDouble(); // Input y3 of his second triangular

        double triangularRib4 =  Math.abs(Math.sqrt(Math.pow(X4-X5, 2)+ 
                    Math.pow(Y4-Y5, 2)) / 2); 
        // will be the distance between the point 1 - 2
        double triangularRib5 =  Math.abs(Math.sqrt(Math.pow(X5-X6, 2)+ 
                    Math.pow(-Y6, 2)) / 2); 
        // will be the distance between the point 2 -3
        double triangularRib6 =  Math.abs(Math.sqrt(Math.pow(X6-X4, 2)+ 
                    Math.pow(Y6-Y4, 2)) / 2);  

        System.out.println("The first triangle is ("+X1+", "+ Y1+
            ") ("+X2+", "+ Y2+") ("+X3+", "+ Y3+")");
        // Prints user coordinates
        System.out.println("Its lengths are " + triangularRib1 +", "+
            triangularRib2 +", "+ triangularRib3 +". ");
        // Prints rib's lengths

        System.out.println("The second triangle is ("+ X1+", "+ Y1+
            ") ("+X2+", "+Y2+") ("+X3+", "+ Y3+")");
        // Prints user coordinates
        System.out.println("Its lengths are " + triangularRib4+", "+ triangularRib5 +", "+
            triangularRib6 +". ");
        // Prints all the info collected on triangular 2

        if (triangularRib4-triangularRib1 == 0 & triangularRib5-triangularRib2 == 0){
            // Comparing triangular 1 to triangular 2 by subtraction of each rib
            if (triangularRib6-triangularRib3 == 0) // Subtraction the last rib
                System.out.print("The triangles are congruent.");
            else
                System.out.print("The triangles are not congruent."); 
        }
        // The triangles are congruent
        else
            System.out.print("The triangles are not congruent.");
        // The triangles are not congruent
    } // end of mathod main
} // end of class Congruent
