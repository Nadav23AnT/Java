
/**
 * This is class  Segment1.
 *
 * @author (your name)
 * @email (nadav2282@gmail.com)
 */
public class Segment1
{
    private Point _poLeft;
    private Point _poRight;

    public Segment1(Point left, Point right)    {
        _poLeft = new Point(left);
        _poRight = new Point(right);
        if (_poLeft.getY() != _poRight.getY()) 
            _poRight.setY(_poLeft.getY());
    }

    public Segment1(double leftX , double leftY , double rightX , double rightY)    {
        _poLeft = new Point(leftX, leftY);
        _poRight = new Point(rightX, rightY);
        if (_poLeft.getY() != _poRight.getY()) 
            _poRight.setY(_poLeft.getY());
    }
    
    public Segment1(Segment1 other)    {
        this(other._poLeft, other._poRight);
    }
    
    
} // end of class Segment1
