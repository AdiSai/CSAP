public class WordLength implements Comparable<WordLength>
{
    private String word;

    public WordLength( String s )
    {
        word = new String(s);
    }
    
    public String getWord()
    {
        return word;
    }
    public int compareTo(WordLength other)
    {
        if (this.word.length() > other.word.length())
        {
            return 1;
        }
        else if (this.word.length() < other.word.length())
        {
            return -1;
        }
        else //0
        {
            if (this.word.compareTo(other.getWord()) > 0)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
    }
    public String toString()
    {
        return word;
    }
}