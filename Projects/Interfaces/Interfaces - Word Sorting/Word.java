import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word = s;
	}
	
	public String getWord()
	{
	    return word;
	}
	public int getNumOfVowels()
	{
	    String[] vowels = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};
	    String subs;
	    int val = 0;
	    for (int i = 0; i < word.length(); i++)
	    {
	        subs = word.substring(i, i+1);
	        for (String s : vowels)
	        {
	            if (subs.equals(s))
	            {
	                val++;
	            }
	        }
	    }
	    return val;
	}
	public int compareTo(Word other)
	{
	    if (this.getNumOfVowels() > other.getNumOfVowels())
        {
            return 1;
        }
        else if (this.getNumOfVowels() < other.getNumOfVowels())
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