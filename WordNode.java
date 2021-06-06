/**
 *  WordNode(String word), WordNode(String word, int mul), WordNode(String word, WordNode next) are constructors
 *  Methods: 
 *     getWord() : returns the word pointing
 *  getMultiplicity() : returns how many times the word appears
 *  getNext() : returns the next word after the current one
 *  setWord() : set the variable _word
 *  setMultiplicity() : sets the multiplicity of the word
 *  setNext() : sets the next word to the current one
 *  toString() : prints the word and her multiplicity
 * 
 * @author (Nadav_Chen)
 */

public class WordNode {
    private String _word; // represent the word
    private int _multiplicity;     // represent the times the word appears
    private WordNode _next; // // represent the next word

    public WordNode(String word)    {
        _word = word;
        _multiplicity = 1;
        _next = null;
    }

    public WordNode(String word, int mul)     {
        _word = word;
        _multiplicity = mul;
        _next = null;
    }

    public WordNode(String word, WordNode next) {
        _word = word;
        _multiplicity = 1;
        _next = next;
    }

    public String getWord() {
        return _word;
    }

    public int getMultiplicity()    {
        return _multiplicity;
    }

    public WordNode getNext()   {
        return _next;
    }

    public void setWord(String word)    {
        _word = word;
    }

    public void setMultiplicity(int multiplicity)   {
        if (multiplicity >= 0)
            _multiplicity = multiplicity;
    }

    public void setNext(WordNode next)  {
        _next = next;
    }

    public String toString()    {
        return "[\""+_word+"\", "+_multiplicity+"]";
    }
}