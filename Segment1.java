
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
    private double _DEFAULT = 0;

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
    
    public Point getPoLeft()    {
        return _poLeft;
    }
    
    public Point getPoRight()   {
        return _poRight;
    }
    
    public double getPoLength()     {
        return _poRight.getX() - _poLeft.getX(); 
    }
    
    public String toString()    {
        return _poLeft.toString() + "---" + _poRight.toString();
    }
    
    public boolean equals(Segment1 other)  {
        return (_poLeft.equals(other._poLeft) && _poRight.equals(other._poRight));
    }
    
    public boolean isAbove(Segment1 other)  {
        return (_poLeft.isAbove(other._poLeft) && _poRight.isAbove(other._poRight));
    }
    
    public boolean isUnder(Segment1 other)  {
        return other.isAbove(this);
    }
    
    public boolean isLeft(Segment1 other)  {
        return _poRight.getX() < other._poLeft.getX() ;
    }
    
    public boolean isRight(Segment1 other)  {
        return _poLeft.getX() > other._poRight.getX();
    }
    
    public void moveHorizontal(double delta)    {
        _poLeft.move(delta , _DEFAULT);
        _poRight.move(delta, _DEFAULT);
    }
    
    public void moveVertical(double delta)    {
        _poLeft.move(_DEFAULT , delta);
        _poRight.move(_DEFAULT , delta);
    }
    
    public void changeSide(double delta)    {
        if (_poRight.getX() + delta > _poLeft.getX())
            _poRight.setX(_poRight.getX() + delta);
    }
    
    public boolean pointOnSegment(Point p)    {
        if (_poRight.getX() - p.getX() >= _DEFAULT)
            return p.getY() == _poLeft.getY() && (_poRight.getX() - p.getX()) >= _poLeft.getX();
        else
            return false;
    }
    
    public boolean isBigger(Segment1 other)  {
        return _poRight.getX()-_poLeft.getX() > other._poRight.getX()-other._poLeft.getX();
    }
    
    public double overlap(Segment1 other)   {
        
    }
} // end of class Segment1
