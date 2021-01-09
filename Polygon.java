
/**
 * This is class  Polygon.
 * The Polygon class represents a convex polygon in a plane.
 * The representation is made by an array that keeps
 * the list of vertices of the polygon in order
 * Their appearance in a polygon. It does not matter who the first vertex is.
 * Each vertex is represented by a point in the plane.
 *
 * @author (Nadav Chen)
 * @email (nadav2282@gmail.com)
 */
import java.util.Scanner;
public class Polygon
{
    private Point[] _vertices;
    private int _noOfVertices;
    final int MAX_NUMBERS = 10;

    public Polygon(){
        /** Constructor, initializes instace variables of the class */
        _vertices = new Point[MAX_NUMBERS];
        _noOfVertices = 0;
    }

    public boolean addVertex(double x, double y)    {
        /** Add a new point to the array */
        if(_noOfVertices == MAX_NUMBERS)
            return false;
        else    
        {
            _vertices[_noOfVertices++] = new Point(x, y);
            return true;
        }
    }

    public Point highestVertex()    {
        /** Find the highest point (relative to the Y-axis) */
        Point highest = new Point(0, 0);
        for(int i=0; i < _noOfVertices; i++)
            if(_vertices[i].getY() > highest.getY())
                highest = _vertices[i];
        return (_noOfVertices != 0)? (new Point(highest)):null;
    }

    public String toString()    {
        /** Printing the contents of the class as output to the user */
        if (_noOfVertices == 0)
            return "The polygon has 0 vertices.";
        else
        {
            String all = "";
            for (int i = 0; i<(_noOfVertices-1); i++)
                all += _vertices[i].toString() + ",";
            all += _vertices[_noOfVertices -1].toString();
            return "The polygon has " + _noOfVertices + " vertices:\n" + "(" + all + ")";
        }
    }

    public double calcPerimeter()  {
        /** Calculate the circumference of the polygon using the calculation
         * of all the ribs individually */
        if(_noOfVertices == 1 || _noOfVertices == 0)
            return 0;
        else if(_noOfVertices == 2)
            return _vertices[0].distance(_vertices[1]);
        else
        {    
            double perimeter = 0;
            for(int i=0; i<_noOfVertices; i++){
                if(i + 1 == _noOfVertices)    
                    perimeter += _vertices[0].distance(_vertices[i]);
                else
                    perimeter+= _vertices[i].distance(_vertices[i + 1]);
            }
            return perimeter;
        }
    }


    public double calcArea()  {
        /** Calculation of the elaborate polygon area,
         * by calculating the X values in intersection with the Y values
         * and vice versa */
        if (_noOfVertices < 3)
            return 0;
        else
        {
            double sumXs = 0 , sumYs = 0 , factor = 2;
            for (int i = 0; i < _noOfVertices - 1; i++)
                sumXs += _vertices [i].getX() * _vertices [i+1].getY();
            sumXs += _vertices[0].getY() * _vertices[_noOfVertices-1].getX();
            for (int m = 0; m < _noOfVertices - 1; m++)
                sumYs += _vertices [m].getY() * _vertices [m+1].getX();
            sumYs += _vertices[0].getX() * _vertices[_noOfVertices-1].getY();
            return Math.abs((sumXs - sumYs)/ factor);
        }
    }

    public boolean isBigger(Polygon other)  {
        /** Comparison whether the polygon on which the method
         * is applied is larger than the polygon in the parameter */
        return this.calcArea() > other.calcArea(); 
    }

    public int findVertex(Point p)  {
        /** Search for the point in the array in the elaborate polygon */
        for(int i= 0; i < _noOfVertices; i++)
            if(_vertices[i].equals(p))
                return i;
        return -1;
    }

    public Point getNextVertex(Point p)  {
        /** You will find the next vertex in the array after p Point */
        if(findVertex(p) != -1){
            if(findVertex(p) == 0 && _noOfVertices - 1 == 0)
                return new Point(p);
            else if(findVertex(p) == _noOfVertices - 1)
                return new Point(_vertices[0]);
            else
                return new Point(_vertices[findVertex(p) + 1]);
        }
        else
            return null;
    }
    
    private Point lowestVertex() {
        /**You will find the lowest vertex in the array
         * relative to the Y-axis */
        Point lowest = new Point(_vertices[0]);
        for(int i=0; i < _noOfVertices; i++)
            if(_vertices[i].getY() < lowest.getY())
                lowest = _vertices[i];
        return (_noOfVertices != 0)? (new Point(lowest)):null;
    }
    
    private Point leftVertex() {
        /** You will find the lowest vertex in the array 
         * relative to the X-axis */
        Point leftest = new Point (_vertices[0]);
        for(int k=0; k <_noOfVertices; k++)
            if(_vertices[k].isLeft(leftest))
                leftest = _vertices[k];
        return (_noOfVertices != 0)? (new Point(leftest)):null;
    }
    
    private Point rightVertex() {
        /** You will find the highest vertex in the array
         * relative to the X-axis */
        Point rightest = new Point (_vertices[0]);
        for(int k=0; k <_noOfVertices; k++)
            if(_vertices[k].isRight(rightest))
                rightest = _vertices[k];
        return (_noOfVertices != 0)? (new Point(rightest)):null;
    }
    
    public Polygon getBoundingBox()  {
        /** Creates a rectangle that blocks the polygon and returns the polygon */
        Polygon box = new Polygon();
        if( _noOfVertices >= 3)  {
            box.addVertex(leftVertex().getX() , lowestVertex().getY());
            box.addVertex(leftVertex().getX() , highestVertex().getY());
            box.addVertex(rightVertex().getX() , highestVertex().getY());
            box.addVertex(rightVertex().getX() , lowestVertex().getY());
            return box;
        }
        else
            return null;
    }

} // end of class Polygon
