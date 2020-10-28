
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
        double triangular_x1, triangular_y1, triangular_x2, triangular_y2, triangular_x3, triangular_y3;
        System.out.println("Please enter 3 coordinates of the first triangular:"); 
        triangular_x1 = scan.nextDouble(); // Input x1 of his first triangular
        triangular_y1 = scan.nextDouble(); // Input y1 of his first triangular
        triangular_x2 = scan.nextDouble(); // Input x2 of his first triangular
        triangular_y2 = scan.nextDouble(); // Input y2 of his first triangular
        triangular_x3 = scan.nextDouble(); // Input x3 of his first triangular
        triangular_y3 = scan.nextDouble(); // Input y3 of his first triangular
        String triangular1 = ((triangular_x1+", "+ triangular_y1)+" "+
                (triangular_x2+", "+ triangular_y2)+" "+(triangular_x3+", "+ triangular_y3));

        double triangularRib1 =  Math.sqrt(Math.pow(triangular_x1-triangular_x2, 2)+ 
                Math.pow(triangular_y1-triangular_y2, 2)) / 2; 
        // will be the distance between the point 1 - 2
        double triangularRib2 =  Math.sqrt(Math.pow(triangular_x2-triangular_x3, 2)+ 
                Math.pow(triangular_y2-triangular_y3, 2)) / 2; 
        // will be the distance between the point 2 -3
        double triangularRib3 =  Math.sqrt(Math.pow(triangular_x1-triangular_x3, 2)+ 
                Math.pow(triangular_y1-triangular_y3, 2)) / 2; 
        // will be the distance between the point 3 - 1 

        System.out.println("Please enter 3 coordinates of the second triangular:"); 
        double triangular_x4 = scan.nextDouble(); // Input x1 of his second triangular
        double triangular_y4 = scan.nextDouble(); // Input y1 of his second triangular
        double triangular_x5 = scan.nextDouble(); // Input x2 of his second triangular
        double triangular_y5 = scan.nextDouble(); // Input y2 of his second triangular
        double triangular_x6 = scan.nextDouble(); // Input x3 of his second triangular
        double triangular_y6 = scan.nextDouble(); // Input y3 of his second triangular

        double triangularRib4 =  Math.abs(Math.sqrt(Math.pow(triangular_x4-triangular_x5, 2)+ 
                    Math.pow(triangular_y4-triangular_y5, 2)) / 2); 
        // will be the distance between the point 1 - 2
        double triangularRib5 =  Math.abs(Math.sqrt(Math.pow(triangular_x5-triangular_x6, 2)+ 
                    Math.pow(triangular_y5-triangular_y6, 2)) / 2); 
        // will be the distance between the point 2 -3
        double triangularRib6 =  Math.abs(Math.sqrt(Math.pow(triangular_x6-triangular_x4, 2)+ 
                    Math.pow(triangular_y6-triangular_y4, 2)) / 2);  

        System.out.println("The first triangle is ("+triangular_x1+", "+ triangular_y1+
            ") ("+triangular_x2+", "+ triangular_y2+") ("+triangular_x3+", "+ triangular_y3+")");
        // Prints user coordinates
        System.out.println("Its lengths are " + triangularRib1 +", "+
            triangularRib2 +", "+ triangularRib3 +". ");
        // Prints rib's lengths

        System.out.println("The second triangle is ("+ triangular_x1+", "+ triangular_y1+
            ") ("+triangular_x2+", "+triangular_y2+") ("+triangular_x3+", "+ triangular_y3+")");
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
