import java.util.*;

/**
 * Write a description of class SpellChecker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpellChecker
{
    private ArrayList<String> words;
    private DictReader reader;

    /**
     * Constructor for objects of class SpellChecker
     */
    public SpellChecker()
    {
        reader = new DictReader("words.txt");
        words = reader.getDictionary();
    }

    public int numberOfWords()
    {
        int count = 0;
        for (int i = 0; i < words.size(); i++)
        {
            count++;
        }
        return count;
    }

    public boolean isKnownWord(String word)
    {
        for (int i = 0; i < words.size(); i++)
        {
            word = word.toLowerCase();
            if (words.get(i).equals(word))
            {
                return true;
            }
        }
        return false;
    }

    public boolean allKnown(ArrayList<String> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if ( !(isKnownWord( list.get(i) ) ))
            {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(String word)
    {
        for (int i = 0; i < words.size(); i++)
        {
            if (words.get(i).equals(word))
            {
                word = word.toLowerCase(); //parse inputs into a standard format
                String rev = new StringBuilder(word).reverse().toString();
                if (word.equals(rev))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        return false;
    }

    public ArrayList<String> anagrams(String word)
    {
        ArrayList<String> wordsThatMatch = new ArrayList<String>();
        word = word.toLowerCase();
        if (!(isKnownWord(word)))
        {
            //System.out.println("no words.");
            return wordsThatMatch; //0 items in the ArrayList.
        }
        int size = word.length();
        int count  = 0;
        for (int i = 0; i < words.size(); i++)
        {
            if (words.get(i).length() == size)
            {
                if (isPalindrome(words.get(i)) && isPalindrome(word))
                {                  
                    wordsThatMatch.add(words.get(i));
                    //System.out.println("is palindrome.");
                }
                for (int j = 0; j < size; j++)
                {
                    //System.out.println(words.get(i));
                    //System.out.println(word.substring(j, j + 1));
                    //System.out.println(words.get(i).indexOf(word.substring(j, j + 1)));
                    if (words.get(i).indexOf(word.substring(j, j + 1)) == -1)
                    {
                        //System.out.println("substring too large.");
                        break;
                    }
                    else if (j == (size - 1))
                    {
                        wordsThatMatch.add(words.get(i));
                        System.out.println(words.get(i) + " to be added." + " The count is now " + count + ".");
                        count++;
                    }
                }
            }
            else
            {
                //System.out.println("size has gotten too large.");
                //size = 1;
                break;
            }
        }
        System.out.println("done.");
        return wordsThatMatch;
    }

    public void insert(String word)
    {
        for (int i = 0; i < words.size(); i++)
        {
            word = word.toLowerCase();
            if (word.compareTo(words.get(i)) == 0)
            {
                break;
            }
            if (word.compareTo(words.get(i)) > 0)
            {
                words.add(i, word);
                break;
            }
        }
    }

    public ArrayList<String> wordsStartingWith(String pre)
    {
        ArrayList<String> datWords = new ArrayList<String>();
        pre = pre.toUpperCase();
        for (int i = 0; i < words.size(); i++)
        {
            if (words.get(i).length() >= pre.length() && words.get(i).substring(0, pre.length()).equals(pre))
            {
                datWords.add(words.get(i));
            }
        }
        return datWords;
    }

    public ArrayList<String> wordsContaining(String part)
    {
        //Old way:
        //         ArrayList<String> datWords = new ArrayList<String>();
        //         int x = 0;
        //         for (int i = 0; i < words.size(); i++)
        //         {
        //             x = 0;
        //             if (x > part.length())
        //             {
        //                 break;
        //             }
        //             else
        //             {
        //                 if (words.get(i).length() >= part.length() && words.get(i).substring(0, part.length()).equals(part))
        //                 {
        //                     datWords.add(words.get(i));
        //                 }
        //                 while (i < x)
        //                 {
        //                     if (words.get(i).length() >= part.length() && words.get(i).substring(x, part.length()).equals(part))
        //                     {
        //                         datWords.add(words.get(i));
        //                     }
        //                 }
        //                 x++;
        //             }
        //         }
        //         return datWords;
        //         
        //New Way:
        ArrayList<String> wordsThatMatch = new ArrayList<String>();
        //part = part.toLowerCase();
        if (!(isKnownWord(part)))
        {
            return wordsThatMatch; //0 items in the ArrayList.
        }
        int size = part.length();
        int count  = 0;
        for (int i = 0; i < words.size(); i++)
        {
            if (isPalindrome(words.get(i)) && isPalindrome(part))
            {                  
                wordsThatMatch.add(words.get(i));
            }
            for (int j = 0; j < size; j++)
            {
                if (words.get(i).indexOf(part.substring(j, j + 1)) == -1)
                {
                    break;
                }
                else if (j == (size - 1))
                {
                    wordsThatMatch.add(words.get(i));
                }
            }
        }
        return wordsThatMatch;
    }

    public boolean remove(String word)
    {
        for (int i = 0; i < words.size(); i++)
        {
            word = word.toLowerCase();
            if (word.equals(words.get(i)))
            {
                words.remove(words.get(i));
                return true;
            }
        }
        return false;
    }

    /*#
     *  INSERT METHODS!
     */

    /**
     * This method is done for you
     * saves updated dictionary text file
     */
    public void save()
    {
        reader.save(words);
    }

}
