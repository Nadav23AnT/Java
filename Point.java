/**
 * This is class Point.
 * 
 *
 * @author (your name)
 * @email (nadav2282@gmail.com)
 */
public class Point
{
    private double _x;
    private double _y;
    private final int DEFAULT_VAL = 0;
    private final int NUM = 2;
    private double _alpha = Math.atan(_y / _x) * 180 / Math.PI;
    private double _radius = Math.sqrt(Math.pow(_x , NUM) + Math.pow(_y , NUM));

    public Point(double x, double y) {
        _x = (x > DEFAULT_VAL) ? x : DEFAULT_VAL;
        _y = (y > DEFAULT_VAL) ? y : DEFAULT_VAL;

    }

    public Point(Point other) {
        this(other._x , other._y);
    }

    public double getX() {
        return _x;
    }

    public double getY() {
        return _y;
    }

    public void setX(double num) {
        if (num >= 0)
            _x = num;
    }

    public void setY(double num) {
        if (num >= 0)
            _y = num;
    }

    public String toString() {
        return ("(" + (Math.round(_x*10000)/(double)10000) +","+
            (Math.round(_y*10000)/(double)10000)+")");
    }

    public boolean equals(Point other) {
        return (_x == other._x && _y == other._y);
    }

    public boolean isAbove(Point other) {
        return _y > other._y;
    }

    public boolean isUnder(Point other) {
        return other.isAbove(this);
    }

    public boolean isLeft(Point other) {
        return _x < other._x;
    }

    public boolean isRight(Point other) {
        return other.isLeft(this);
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow((_x-p._x) , NUM) + Math.pow((_y-p._y) , NUM));
    }

    public void move(double dx, double dy) {
        if ((_x + dx) >= 0 && (_y + dy) >= 0){
            setX(_x + dx);
            setY(_y + dy);
        }
    }
} // end of class Point
