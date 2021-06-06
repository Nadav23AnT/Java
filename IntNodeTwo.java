import java.security.PublicKey;

import javax.crypto.interfaces.PBEKey;

/**
 * @
 * @author (Nadav_Chen)
 */

 public class IntNodeTwo    {
    private int _num;
    private IntNodeTwo _next, _prev;

    public IntNodeTwo(int n)  {
      _num = n;
      _next = null;
      _prev = null;
    }

    public IntNodeTwo(int num, IntNodeTwo n, IntNodeTwo p)  {
       _num = num;
       _next = n;
       _prev = p;
    }
    
    public int getNum() { return _num; }
    public IntNodeTwo getNext()  {return _next; }
    public IntNodeTwo getPrev() { return _prev; }

    public void setNum(int num)  {_num = num; }
    public void setNext (IntNodeTwo n) {_next = n; }
    public void setPrev (IntNodeTwo n) {_prev = n; }
 }