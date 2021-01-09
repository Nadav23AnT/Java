
/**
 * This is class Segment1.
 * Uses the Point class and creates a Segment 
 * between two points parallel to the X-axis
 *
 * @author (Nadav Chen)
 * @email (nadav2282@gmail.com)
 */
public class Segment1
{
    private final double _DEFAULT = 0;
    private Point _poLeft; // Represents the left point of the segment
    private Point _poRight; // Represents the right point of the segment

    public Segment1(Point left, Point right)    {
        /** Gets two parameters that constitute a left point
         * and a right point and creates a segment parallel to X */
        _poLeft = new Point(left); 
        _poRight = new Point(right); 
        if (_poLeft.getY() != _poRight.getY()) 
        // Checks whether the segment is parallel, if not changes the y value to be parallel
            _poRight.setY(_poLeft.getY());
    }

    public Segment1(double leftX , double leftY , double rightX , double rightY)    {
        /** Gets four parameters that constitute a left point
         * and a right point and creates a segment parallel to X */
        _poLeft = new Point(leftX, leftY);
        _poRight = new Point(rightX, rightY);
        if (_poLeft.getY() != _poRight.getY()) 
        // Checks whether the segment is parallel, if not changes the y value to be parallel
            _poRight.setY(_poLeft.getY());
    }

    public Segment1(Segment1 other)    {
        /** A builder who copies the segment to the point
         * at which the method is applied */
        this(other._poLeft, other._poRight);
    }

    public Point getPoLeft()    {
        /** Returns the left point of the segment */
        return new Point(_poLeft);
    }

    public Point getPoRight()   {
        /** Returns the right point of the segment */
        return new Point(_poRight);
    }

    public double getLength()    {
        /** Returns the length of the segment */
        return _poRight.distance(_poLeft); 
    }

    public String toString()    {
        /** Returns the contents of the object as a string of characters */
        return _poLeft.toString() + "---" + _poRight.toString();
    }

    public boolean equals(Segment1 other)  {
        /** A method that checks whether the sections are identical */
        return (_poLeft.equals(other._poLeft) && _poRight.equals(other._poRight));
    }

    public boolean isAbove(Segment1 other)  {
        /** Checks whether the segment on which the method
         * was applied is above the section in the parameter */
        return (_poLeft.isAbove(other._poLeft) && _poRight.isAbove(other._poRight));
    }

    public boolean isUnder(Segment1 other)  {
        /** Checks whether the segment on which the method
         * was applied is under the section in the parameter */
        return other.isAbove(this);
    }

    public boolean isLeft(Segment1 other)  {
        /** Checks whether the segment on which the method
         * was applied is on the left side of the section in the parameter */
        return _poRight.isLeft(other._poLeft);
    }

    public boolean isRight(Segment1 other)  {
        /** Checks whether the segment on which the method
         * was applied is on the right side of the section in the parameter */
        return other.isLeft(this);
    }

    public void moveHorizontal(double delta)    {
        /** A method that moves the segment relative to the X-axis (horizontal) */
        if (_poLeft.getX() + delta >= _DEFAULT && _poRight.getX() + delta >= _DEFAULT){
            _poLeft.move(delta , _DEFAULT);
            _poRight.move(delta, _DEFAULT);
        }
    }

    public void moveVertical(double delta)    {
        /** A method that moves the segment relative to the Y-axis (vertical) */
        if (_poRight.getY() + delta >= _DEFAULT){
            _poLeft.move(_DEFAULT , delta);
            _poRight.move(_DEFAULT ,  delta);
        }
    }

    public void changeSize(double delta)    {
        /** A method that increases the length of the segment by the number in the parameter, 
         * but ensures that it remains in the first quarter */
        if (_poRight.getX() + delta > _poLeft.getX())
            _poRight.setX(_poRight.getX() + delta);
    }

    public boolean pointOnSegment(Point p)    {
        /** Checks whether point p in the parameter is on the segment */
        return p.getY() == _poLeft.getY() && p.getX() >= _poLeft.getX() && _poRight.getX() >= p.getX();
    }

    public boolean isBigger(Segment1 other)  {
        /** Is the segments on which the method was applied larger than the section in the parameter */
        return this.getLength() > other.getLength();
    }

    public double overlap(Segment1 other)   {
        /** Returns the length of the overlap between the segments */
        if (!this.isLeft(other) && !this.isRight(other))
            if (_poRight.isRight(other._poRight) && _poLeft.getX() > other._poLeft.getX())
                return other._poRight.getX() - _poLeft.getX();
            else if(other._poRight.isRight(_poRight) && other._poLeft.getX() > _poLeft.getX())
                return _poRight.getX() - other._poLeft.getX();
            else if(_poRight.getX() >= other._poRight.getX() && _poLeft.getX() <= other._poLeft.getX())  
                return other.getLength();
            else if(_poRight.getX() <= other._poRight.getX() && _poLeft.getX() >= other._poLeft.getX())
                return this.getLength();
            else
                return _DEFAULT;
        else
                return _DEFAULT;
    }

    public double trapezePerimeter(Segment1 other)   {
        /** Returns the circumference of the trapezoid trapped between the segments */
        return _poLeft.distance(other._poLeft) + _poRight.distance(other._poRight) +
        this.getLength() + other.getLength();
    }
} // end of class Segment1
