/**
 * This is class Point.
 * This class is according to the polar system
 * And will represent a point in a geometric graph in the first quarter only
 * The class has private instances like alpha radius which 
 * represent the length of the vector and the angle (in degrees) of the vector
 * 
 * @author (Nadav Chen)
 * @email (nadav2282@gmail.com)
 */
public class Point
{
    private final int DEFAULT_VAL = 0, NUM = 2, HIGH_DEGREE = 180;
    // Representing the angle of the vector
    private double _alpha;
    // Representing the length of the vector
    private double _radius;

    public Point(double x, double y) {
        /** A class builder gets the private instances?and creates a point */
        if (x >= DEFAULT_VAL && y >= DEFAULT_VAL) {
            _alpha = Math.atan(y / x) * HIGH_DEGREE / Math.PI;
            _radius = Math.sqrt(Math.pow(x , NUM) + Math.pow(y , NUM));
        }
    }

    public Point(Point other) {
        /** Gets another point as a parameter and copies it */
        _alpha = other._alpha;
        _radius = other._radius;
    }

    public double getX() {
        /** Returns the value of X */
        return _radius * Math.cos((_alpha / HIGH_DEGREE * Math.PI));
    }

    public double getY() {
        /** Returns the value of Y */
        return _radius * Math.sin((_alpha / HIGH_DEGREE * Math.PI));
    }

    public void setX(double num) {
        /** Changes the value of X as long as it is a positive number */
        if (num >= 0){
            _alpha = Math.atan(getY() / num) * HIGH_DEGREE / Math.PI;
            _radius = Math.sqrt(Math.pow(num , NUM) + Math.pow(getY() , NUM));
        }
    }

    public void setY(double num) {
        /** Changes the value of Y as long as it is a positive number */
        if (num >= 0)
            _alpha = Math.atan(num / getX()) * HIGH_DEGREE / Math.PI;
        _radius = Math.sqrt(Math.pow(getX() , NUM) + Math.pow(num , NUM));
    }

    public String toString() {
        /** Returns the contents of the object as a string of characters */
        return ("(" + (Math.round(getX()*10000)/(double)10000) +","+
            (Math.round(getY()*10000)/(double)10000)+")");
    }

    public boolean equals(Point other) {
        /** Gets a point as a parameter and compares 
         * whether the point on which the method was applied is equal */
        return (getX() == other.getX() && getY() == other.getY());
    }

    public boolean isAbove(Point other) {
        /** If the point at which the method was applied
         * is above the point received as a parameter then returns true */
        return getY() > other.getY();
    }

    public boolean isUnder(Point other) {
        /** If the point at which the method was applied
         * is below the point received as a parameter then returns true */
        return other.isAbove(this);
    }

    public boolean isLeft(Point other) {
        /** Check if the point on which the method is applied
         * is on the left side (according to the X-axis) of the point in the parameter */
        return getX() < other.getX();
    }

    public boolean isRight(Point other) {
        /** Check if the point on which the method is applied
         * is on the right side (according to the X-axis) of the point in the parameter */
        return other.isLeft(this);
    }

    public double distance(Point p) {
        /** Measures the distance between the point and the point in the parameter */
        return Math.sqrt(Math.pow((getX()-p.getX()) , NUM) +
            Math.pow((getY()-p.getY()) , NUM));
    }

    public void move(double dx, double dy) {
        /** A method that moves the point according to the addition
         * in the numbers written in the parameter */
        if ((getX() + dx) >= DEFAULT_VAL && (getY() + dy) >= DEFAULT_VAL){
            setX(getX() + dx);
            setY(getY() + dy);
        }
    }
} // end of class Point
