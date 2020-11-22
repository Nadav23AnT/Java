
/**
 * This is class Congruent.
 * Made to calculate whether two triangles are equal by specifying their coordinates
 * The user inserts 3 points per triangle for a total of two triangles, 
 * then calculate whether these triangles are congruent
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
        double x1, y1, x2, y2, x3, y3;
        System.out.println("Please enter 3 coordinates of the first triangular:"); 
        x1 = scan.nextDouble(); // Input x1 of his first triangular
        y1 = scan.nextDouble(); // Input y1 of his first triangular
        x2 = scan.nextDouble(); // Input x2 of his first triangular
        y2 = scan.nextDouble(); // Input y2 of his first triangular
        x3 = scan.nextDouble(); // Input x3 of his first triangular
        y3 = scan.nextDouble(); // Input y3 of his first triangular

        double rib1 =  Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)) / 2; 
        // will be the distance between the point 1 - 2
        double rib2 =  Math.sqrt(Math.pow(x2-x3, 2)+ Math.pow(y2-y3, 2)) / 2; 
        // will be the distance between the point 2 -3
        double rib3 =  Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2)) / 2; 
        // will be the distance between the point 3 - 1 

        System.out.println("Please enter 3 coordinates of the second triangular:"); 
        double x4 = scan.nextDouble(); // Input x1 of his second triangular
        double y4 = scan.nextDouble(); // Input y1 of his second triangular
        double x5 = scan.nextDouble(); // Input x2 of his second triangular
        double y5 = scan.nextDouble(); // Input y2 of his second triangular
        double x6 = scan.nextDouble(); // Input x3 of his second triangular
        double y6 = scan.nextDouble(); // Input y3 of his second triangular

        double rib4 =  Math.abs(Math.sqrt(Math.pow(x4-x5, 2)+ Math.pow(y4-y5, 2)) / 2); 
        // will be the distance between the point 1 - 2
        double rib5 =  Math.abs(Math.sqrt(Math.pow(x5-x6, 2)+ Math.pow(y5-y6, 2)) / 2); 
        // will be the distance between the point 2 -3
        double rib6 =  Math.abs(Math.sqrt(Math.pow(x6-x4, 2)+ Math.pow(y6-y4, 2)) / 2);  

        System.out.println("The first triangle is ("+x1+", "+ y1+
            ") ("+x2+", "+ y2+") ("+x3+", "+ y3+")");
        // Prints user coordinates
        System.out.println("Its lengths are " + rib1 +", "+ rib2 +", "+ rib3 +". ");
        // Prints rib's lengths

        System.out.println("The second triangle is ("+ x1+", "+ y1+
            ") ("+x2+", "+y2+") ("+x3+", "+ y3+")");
        // Prints user coordinates
        System.out.println("Its lengths are " + rib4+", "+ rib5 +", "+ rib6 +". ");
        // Prints all the info collected on triangular 2
        
        if (rib4 == rib1 || rib4 == rib2 || rib4 == rib3) // Campering rib4 to triangular 1 ribs
            if (rib5 == rib1 || rib5 == rib2 || rib5 == rib3) // Campering rib5 to triangular 1 ribs
                if(rib6 == rib1 || rib6 == rib2 || rib6 == rib3) // Campering rib6 to triangular 1 ribs
                    System.out.print("The triangles are congruent."); // The triangles are congruent
                else
                    System.out.print("The triangles are not congruent.");
            else
                System.out.print("The triangles are not congruent.");
        else
            System.out.print("The triangles are not congruent.");
        // The triangles are not congruent
    } // end of mathod main
} // end of class Congruent
