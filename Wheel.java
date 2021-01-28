
/**
 * This is class  Wheel.
 *
 * @author (your name)
 * @email (nadav2282@gmail.com)
 */
import java.util.Scanner;
public class Wheel
{
    private int _catNum; // will remain postive
    private boolean _isOk;
    private final int DEFAULT=1234;

    public Wheel()  {
        _catNum = DEFAULT;
        _isOk = true;
    }

    public Wheel(int num)  {
        _catNum = num;
        if( _catNum < 0)
            _catNum = DEFAULT;
        if(isVaildCatNum() == true) 
            _isOk = true;
        else
            _isOk = false;
    }

    public Wheel(Wheel other)     {
        _catNum = other._catNum;
        _isOk = other._isOk;
    }

    public boolean isVaildCatNum()  {
        if(_isOk == true)
            return true;
        if(_catNum > 0 && _catNum%3==0){
            int last = _catNum;
            while(last > 0){
                last /= 10;
                if(last < 10 && last == 7);
                return true;
            }
        }
        return false;
    }
}// end of class Wheel
