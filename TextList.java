/**
 * TextList() and TextList(String text) are constructors
 * methods:
 * addToData() : add a word to the list
 * howManyWords() : calculates how many words are in the list
 * howManyDifferentWords() : calculates how many different words are in the list
 * howManyStarting() : calculate how many words start with the letter in the input
 * mostFrequentStartingLetter() : finds what is the most frequant starting letter
 * toString: prints all words with the right multiplicity next to it
 * 
 * @author (Nadav_Chen)
 */

public class TextList {
    private WordNode _head;

    public TextList()   {
        _head = null;
    }

    public TextList (String text)   {
        if(text.length() == 0) // if the list is empty
			_head = null;
		else    {
			while (text.length() > 0) {// run on all over text string
				int spaceIn = text.indexOf(" ");    // searching for the next space index
				if (spaceIn < 0)     {  // if there is only one word, nothing to sort
					addOriginData(text);
					text = "";
				}
				else    {
					String word = text.substring(0, spaceIn);   // creating a word using substring to text until the space index
					addOriginData(word); // adding the word to a list without sorting
					text = text.substring(spaceIn + 1); // removing the word from text variable
				}
			}
		sortList();
		}
	} // DTIME: O(n*logn) DSPACE: O(n)

    private void addOriginData(String word) { 	// adding the word to a list without sorting
		WordNode newWord = new WordNode(word, _head);   // creating a node with the new word, and _head as next
		_head = newWord; 
	} // DTIME: O(1) DSPACE: O(1)

    private WordNode mergeSortList(WordNode start, WordNode end)    {   // Sorting the list from start to end nodes
		if (start == end)   // returns the first node of the sorted list
			return new WordNode(start.getWord());
		WordNode midWord = findMid(start, end);     // Represent midWord between start and end
		WordNode nodeCheckTwo = mergeSortList(start, midWord);    // sort from the start to midWord
		WordNode nodeCheckThree = mergeSortList(midWord.getNext(), end);     // sort from the midWord to the end
		WordNode tail = null;   // tail represent the end of the sorted list
        WordNode head = null;   // tail represent the start of the sorted list

		while (nodeCheckTwo != null && nodeCheckThree != null)  {	
			WordNode node = null;
			if (nodeCheckTwo.getWord().compareTo(nodeCheckThree.getWord()) < 0) {  
				// if nodeCheckTwo is smaller than nodeCheckThree return true
				node = nodeCheckTwo; 	// set node to nodeCheckTwo 
				nodeCheckTwo = nodeCheckTwo.getNext(); // set nodeCheckTwo to the next Node
			}
			else    {
				// if nodeCheckTwo is smaller than nodeCheckThree return false
				node = nodeCheckThree;	// set node to nodeCheckThree 
				nodeCheckThree = nodeCheckThree.getNext();	// set nodeCheckThree to next node
			}
			if (head == null) // if it is the first node in the list
				head = tail = new WordNode(node.getWord(), node.getMultiplicity());
			else    {
				if (node.getWord().equals(tail.getWord()))  
				// if node is equal numerical to tail word(last word) returns true, adds multiplicity to tail
					tail.setMultiplicity(tail.getMultiplicity() + node.getMultiplicity());
				else    {
					// if node is bigger numerical to tail word(last word). sets tail next word to node
					tail.setNext(new WordNode(node.getWord(), node.getMultiplicity()));
					tail = tail.getNext();
				}
			}
		}
		while (nodeCheckTwo != null){     // check all again with nodeCheckTwo as the While loop before
			if (nodeCheckTwo.getWord().equals(tail.getWord()))
				tail.setMultiplicity(tail.getMultiplicity() + nodeCheckTwo.getMultiplicity());
			else	{
				tail.setNext(new WordNode(nodeCheckTwo.getWord(), nodeCheckTwo.getMultiplicity()));
				tail = tail.getNext();
			}
			nodeCheckTwo = nodeCheckTwo.getNext();
		}
		while (nodeCheckThree != null)   {   // check all again with nodeCheckThree as the While loop before
			if (nodeCheckThree.getWord().equals(tail.getWord()))
				tail.setMultiplicity(tail.getMultiplicity() + nodeCheckThree.getMultiplicity());
			else	{
				tail.setNext(new WordNode(nodeCheckThree.getWord(), nodeCheckThree.getMultiplicity()));
				tail = tail.getNext();
			}
			nodeCheckThree = nodeCheckThree.getNext();
		}
		return head; // returns the head of the sorted list
	}   // DTIME: O(n*logn) DSPACE: O(n)

	private void sortList()     {
		WordNode last = tail();
		_head = mergeSortList(_head, last);
	} // DTIME: O(n*logn) DSPACE: O(n)
	
	private WordNode tail() {
		if (_head == null)
			return null;
		WordNode curr = _head;
		while (curr.getNext() != null)
			curr = curr.getNext();
		return curr;
	}   // DTIME: O(n) DSPACE: O(1)

    private WordNode findMid(WordNode start, WordNode end)  {   // finds the middle node
		WordNode mid = start;
		while (start != end && start.getNext() != end)  {     // until end is not reached
			start = start.getNext().getNext();  // everytime going forward 2 nodes
			mid = mid.getNext();     // everytime going forward 1 nodes
		}
		return mid;     // returns the middle node found
	}	// DTIME: O(n) DSPACE: O(1)

	public void addToData(String word)  {   // adding new word to the list
		if (word.length() == 0) 
			return ;
		if (_head == null)  {
			_head = new WordNode(word);     // if head is tail (last word)
			return ;
		}
		if (word.compareTo(_head.getWord()) < 0)    {   // if true : we want the new word to be before the old one
			_head = new WordNode(word, _head);
			return ;
		}
        if(word.compareTo(_head.getWord()) == 0)    {   // when we word that already exist and this is the first word
            _head.setMultiplicity(_head.getMultiplicity()+1);
            return ;
    }
		WordNode curr = _head; // starting to run from the first node
		WordNode prev = null; 
		while (curr.getNext() != null)  {
			if (word.compareTo(curr.getWord()) < 0) { // if the new word is smaller then curr
				WordNode newNode = new WordNode(word); // creating new node
				newNode.setNext(curr);  // new node will point curr as next
				prev.setNext(newNode);  // setting prev word behind the new node
				return;
			}
			if (word.compareTo(curr.getWord()) == 0)    { // the word is equal to curr
				curr.setMultiplicity(curr.getMultiplicity() + 1); // adding multiplicity because it is equal
				return;
			}
			curr = curr.getNext();  //  pushing the curr to the next word
		}
		if (word.compareTo(curr.getWord()) < 0)     {   // checking again just on the last node
			WordNode newNode = new WordNode(word);
			newNode.setNext(curr);  // new node will point curr as next
			prev.setNext(newNode);  // setting prev word behind the new node
			return;
		}
		if (word.compareTo(curr.getWord()) == 0)    {   // checking again just on the last node
			curr.setMultiplicity(curr.getMultiplicity() + 1);   // adding multiplicity because it is equal
			return;
		}
		curr.setNext(new WordNode(word));   // curr now is the last node, so we are adding word as next
	}		// DTIME: O(n^2) DSPACE: O(1)

	public int howManyWords()   {  
		WordNode curr = _head;
		int count = 0;
		while (curr != null)    {   // countnig the number of multiplicity of each word
			count += curr.getMultiplicity();
			curr = curr.getNext(); // setting curr to the next node
		}
		return count;
	}	// DTIME: O(n) DSPACE: O(1)

	public int howManyDifferentWords()  { 
		WordNode curr = _head;
		int count = 0;
		while (curr != null)    {   // counting all words
			count++;
			curr = curr.getNext();
		}
		return count;
	}   //	DTIME: O(n) DSPACE: O(1)

	public String mostFrequentWord()    {   // returns the most frequent word
		if (_head == null) // if the list is empty
			return "";
		WordNode mostFreq = _head;  // set mostFreq: starting from the head
		WordNode curr = _head.getNext();    // setting curr to run over the list
		while (curr != null)    { 
			if (curr.getMultiplicity() > mostFreq.getMultiplicity())    // find the word with the highest multiplicity
				mostFreq = curr;
			curr = curr.getNext();
		}
		return mostFreq.getWord(); 
	}	// DTIME: O(n) DSPACE: O(1)

	public int howManyStarting(char letter) {   // counting how many words starting with letter
		WordNode curr = _head;
		int count = 0;
		while (curr != null && curr.getWord().charAt(0) <= letter)  {
			if (curr.getWord().charAt(0) == letter) // if starting with the letter count++;
				count += curr.getMultiplicity();
			curr = curr.getNext(); // skipping to the next word 
		}
		return count;	
	}	// DTIME: O(n) DSPACE: O(1)

	public char mostFrequentStartingLetter()    {  
		return mostFrequentStartingLetter(_head, ' ', 0);
	}

	private char mostFrequentStartingLetter(WordNode curr,char mostFrequent,int maxCount)   {
		if (curr == null)   // if the list is empty, returns space (' ')
			return mostFrequent;
		int currStartingWord = howManyStarting(curr.getWord().charAt(0));   
        // how many time the first char of the curr word apears
		if (currStartingWord > maxCount)   {
			maxCount = currStartingWord;
			mostFrequent = curr.getWord().charAt(0);    // mostFrequent resetting to the first char of curr
		}
		return mostFrequentStartingLetter(curr.getNext(), mostFrequent, maxCount);  // checking the next node with recursion
	}

	public String toString()    {
		String str = "";
		for (WordNode curr = _head; curr != null; curr = curr.getNext())
		{
			if (str.length() > 0)
				str += "\n";
			str += curr.getWord() + "\t" + curr.getMultiplicity();
		}
		return str;
	}   // DTIME: O(n) DSPACE: O(n)
}