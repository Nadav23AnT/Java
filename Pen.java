
/**
 * This is class  Pen.
 * A class that represents a pen that includes the characteristics: 
 * color, production location, price, and weight
 * (includes many methods that are detailed below)
 *
 * @author (your name)
 * @email (nadav2282@gmail.com)
 */
import java.util.Scanner;
public class Pen
{
    private String _color;
    private String _made;
    private int _price;
    private double _weight;
    private final int _HIGH = 10;
    private final int _DEFAULT = 0;
    
    public Pen(String color , String made , int price , double weight)  {
        _color = color;
        _made = made;
        _price = price;
        if (price <= _DEFAULT)
            _price = _HIGH;
        _weight = weight;
        if (weight <= _DEFAULT)
            _weight = _HIGH;
    }

    public String getColor()    { 
        /** The method returns the color of the pen */
        return _color;
    } // end method getColor() 

    public String getMade()     { 
        /** The method returns the manufacturer's name of the pen */
        return _made;
    } // end method getMade()

    public boolean isSameMade(Pen other)    { 
        /** A method that returns true if the other pen manufacturer name
         * is the same as the current manufacturer's name */
        return (_made.equals(other._made));
    } // end method isSameMade()

    public boolean isSamePrice(Pen other)   {
        /** A method that returns true if the price of the other 
         * pen is the same as the current pen */
        return (_price == other._price);
    } // end method isSamePrice()

    public boolean isBluePen()  {
        /** A method that returns true if the pen color is blue */
        return (_color.equals("blue"));
    } // end method isBluePen()

    public int getPrice()   {
        /** The method returns the price of the pen */
        return _price;
    } // end method getPrice()

    public void setPrice(int x)     {
        /** The method updates the price of the pen to be equal to x
         * unless it is small or equal to 0 */
        if(_price > _DEFAULT);
            _price = x;
    } // end method setPrice()

    public double getWeight()   {
        /** The method returns the weight of the pen */
        return _weight;
    } // end method getWeight()

    public String toString()    {
        /** The method returns as a single-line description string about the pen */
        return (_color +" pen, made by "+ _made +
            " , weights " + _weight + " grams, price: " + _price +
            " Shekels");
    } // end method toString()

} // end of class Pen
