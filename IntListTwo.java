public class IntListTwo {
    private IntNodeTwo _head, _tail;

    public IntListTwo() {
        _head = null;
        _tail = null;
    }
    public void insertAfter(int num, IntNodeTwo node)   {
        IntNodeTwo temp = new IntNodeTwo(num);
        if(_head == null)   {
            _head = temp;
            _tail = _head;
        }
        else    {
            IntNodeTwo curr = _head;
            while(curr != node)
                curr = curr.getNext();
            temp.setNext(curr.getNext());
            temp.setPrev(curr);
            curr.setNext(temp);
            if(temp.getNext() == null)
                _tail = temp;
            else
                temp.getNext().setPrev(temp);
        }
    }

    public int lengthRec()  {
        return lengthRec(_head);
    }
    private int lengthRec(IntNodeTwo p) {
        if(p == null) { return 0; }
        return 1 + lengthRec(p.getNext());
    }

    public void printRec()  {
        System.out.println("The list is: ");
        printRec(_head);
    }
    private void printRec(IntNodeTwo p) {
        if(p == null)   {
            System.out.println(" null ");
            return;
        }
        else    {
            System.out.print(p.getNum() + " --> ");
            printRec(p.getNext());
        }
    }

}
