
/**
 * This is class  Bus.
 *
 * @author (your name)
 * @email (nadav2282@gmail.com)
 */
import java.util.Scanner;
public class Bus
{
    private final int MAX = 10;
    private Wheel[] _wheels ;
    private int _noOfWheels;

    public boolean addWheel(int wheel)   {
        if(_noOfWheels >= MAX){
            Wheel temp = new Wheel();
            temp = _wheels[_noOfWheels/2];
            _wheels[_noOfWheels/2] = wheel;
            for(int i = 1 ; i < _noOfWheels/2+1; i++){
                _wheels[_noOfWheels/2+i] = new Wheel(temp);
                temp = new Wheel(_wheels[_noOfWheels/2+i]);
            }
            _noOfWheels++;
            return true;
        }
        else
            return false;
    }

    public boolean allVaild()   {
        for(int i=0; i < _noOfWheels; i++)
            if(_wheels[i].isVaildCatNum() == false)
                return false;
        return true;
    }

    public boolean canDrive()   {
        boolean allOk = true;
        if(_noOfWheels%2 == 0 && this.allVaild())
            for(int k=0; k < _noOfWheels; k++){
                if(_wheels[k].getIsOk() == false){
                    System.out.println(_wheels[k].getCatNum());
                    allOk = false;
                }
                return allOk;
            }
        return false;
    }
} // end of class Bus
