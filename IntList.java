public class IntList {
    private IntNode _head;
	public IntList() {
		_head = null;
	}
	public IntList(IntNode node) {
		_head = node;
	}

	public boolean empty() {
		return _head == null;
	}

    public IntNode secondMax()  {
        if (length() < 2)
            return null;
        IntNode max, sec;
        if (_head.getValue() > _head.getNext().getValue())  {
            max = _head;
            sec = _head.getNext();  }
        else    {
            max = _head.getNext();
            sec = _head;
        }
        return secondMax(max, sec, _head.getNext().getNext());
    }
    private IntNode secondMax(IntNode max, IntNode sec, IntNode current)
    {
        if (current == null)
            return sec;
        if (current.getValue() > max.getValue())
        {
            sec = max;
            max = current;
        }
        else if (current.getValue() > sec.getValue())
            sec = current;
        return secondMax(max, sec, current.getNext());
    }

    public void printDouble() 
	{
		if (empty())
			return;
		printDouble(_head);
	}
	
	private void printDouble(IntNode current) 
	{
		if(current == null)
		    return;
		System.out.print(current.getValue() +" ");
		printDouble(current.getNext());
        System.out.print(current.getValue() +" ");
		
	}

	public void addToEnd(IntNode node) {
		if (empty( ))
			_head = node;
		else {
			IntNode ptr = _head;
			while (ptr.getNext( ) != null)
				ptr = ptr.getNext( );
			ptr.setNext(node);
		}
	}
	
	public int length()
	{
		IntNode temp = _head;
		int count = 0;
		while (temp != null)
		{
			count++;
			temp = temp.getNext();
		}
		return count;
	} 
}
