
/**
 * This is class  Driver.
 * The purpose of this class is to test the classroom and its methods and properties
 * This class has 2 pens, the user inserts 4 variables per pen
 * All pen class methods are used in this class
 *
 * @author (your name)
 * @email (nadav2282@gmail.com)
 */
import java.util.Scanner;
public class Driver
{
    public static void main (String[ ] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter pen details: color , made in , price , weight");
        Pen penA = new Pen(scan.next(), scan.next(), scan.nextInt(), scan.nextDouble());
        System.out.println("Please Enter the other pen details: color , made in , price , weight");
        Pen penB = new Pen(scan.next(), scan.next(), scan.nextInt(), scan.nextDouble());
        
        System.out.println(penA.toString()); // Prints all info Pen A()
        System.out.println(penB.toString()); // Prints all info Pen B()
        
        // prints method getColor()
        System.out.println("Pen A color is: " + penA.getColor()); 
        // prints method getMade()
        System.out.println("Pen B made in: " + penB.getMade()); 
        // using method isSameMade()
        System.out.println("penA made in the same place as penB? " + penA.isSameMade(penB));
        // using method isSamePrice()
        System.out.println("penA price equal to penB? " + penA.isSamePrice(penB));
        // using method isBluePen()
        System.out.println("penB is Blue? " + penB.isBluePen());
        // using method setPrice()
        penA.setPrice(35);
        // using method getPrice()
        System.out.println("What is penA price? " + penA.getPrice());
        // using method getWeight()
        System.out.println("What is penB weight? " + penA.getWeight());
    } // end of mathod main
} // end of class Driver
