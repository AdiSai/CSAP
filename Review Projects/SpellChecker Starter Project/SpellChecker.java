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
            return wordsThatMatch; //0 items in the ArrayList.
        }
        int size = word.length();
        int count  = 0;
        String wordThatIsBeingChecked = "";
        boolean paramWordIsAPalindrome = isPalindrome(word);
        for (int i = 0; i < words.size(); i++)
        {
            wordThatIsBeingChecked = words.get(i).toLowerCase();
            if (wordThatIsBeingChecked.length() == size)
            {                
                if (isPalindrome(wordThatIsBeingChecked) && paramWordIsAPalindrome)
                {                  
                    for (int j = 0; j < size; j++)
                    {
                        if (wordThatIsBeingChecked.indexOf(word.substring(j, j + 1)) == -1)
                        {
                            break;
                        }
                        else if (j == (size - 1))
                        {
                            if (!wordsThatMatch.contains(wordThatIsBeingChecked))
                            {
                                wordsThatMatch.add(wordThatIsBeingChecked);
                                count++;
                                System.out.println("(Line 111): The word " + wordThatIsBeingChecked + " will be added." + " The number of words found so far is now " + count + ".");
                            }
                            break; //done, so get next word
                        }
                    }
                }
                for (int k = 0; k < size; k++)
                {
                    if (paramWordIsAPalindrome)
                    {
                        if (word.indexOf(wordThatIsBeingChecked.substring(k, k + 1)) == -1)
                        {
                            break; //stop the loop for checking in word, and get a new word
                        }
                        else if (k == (size - 1))
                        {
                            if (!wordsThatMatch.contains(wordThatIsBeingChecked))
                            {
                                wordsThatMatch.add(wordThatIsBeingChecked);
                                count++;
                                System.out.println("(Line 129): The word " + wordThatIsBeingChecked + " will be added." + " The number of words found so far is now " + count + ".");
                            }
                            break; //done, so get next word
                        }
                    }
                    else if (!(paramWordIsAPalindrome))
                    {
                        if (wordThatIsBeingChecked.indexOf(word.substring(k, k + 1)) == -1)
                        {
                            break; //stop the loop for checking in word, and get a new word
                        }
                        else if (k == (size - 1))
                        {
                            if (!wordsThatMatch.contains(wordThatIsBeingChecked))
                            {
                                wordsThatMatch.add(wordThatIsBeingChecked);
                                count++;
                                System.out.println("(Line 129): The word " + wordThatIsBeingChecked + " will be added." + " The number of words found so far is now " + count + ".");
                            }
                            break; //done, so get next word
                        }
                    }
                }
            }
            else
            {
                continue; //the size of words.get(i) != word, so get the next word.
            }
        }
        System.out.println();
        return wordsThatMatch;
        //         
        //         Other Way (not working):
        //         public ArrayList<String> anagrams(String word)
        //     {
        //         ArrayList<String> wordsThatMatch = new ArrayList<String>();
        //         word = word.toLowerCase();
        //         if (!(isKnownWord(word)))
        //         {
        //             return wordsThatMatch; //0 items in the ArrayList.
        //         }
        //         int size = word.length();
        //         int count  = 0;
        //         String wordThatIsBeingChecked = "";
        //         boolean paramWordIsAPalindrome = isPalindrome(word);
        //         for (int i = 0; i < words.size(); i++)
        //         {
        //             wordThatIsBeingChecked = words.get(i).toLowerCase();
        //             if (wordThatIsBeingChecked.length() == size)
        //             {                
        //                 if (isPalindrome(wordThatIsBeingChecked) && paramWordIsAPalindrome)
        //                 {                  
        //                     for (int j = 0; j < size; j++)
        //                     {
        //                         if (wordThatIsBeingChecked.indexOf(word.substring(j, j + 1)) == -1)
        //                         {
        //                             break;
        //                         }
        //                         else if (j == (size - 1))
        //                         {
        //                             if (!wordsThatMatch.contains(wordThatIsBeingChecked))
        //                             {
        //                                 wordsThatMatch.add(wordThatIsBeingChecked);
        //                                 word = word.replaceFirst(word.substring(j, j + 1), "0");
        //                                 count++;
        //                                 System.out.println("(Line 195): The word " + wordThatIsBeingChecked + " will be added." + " The number of words found so far is now " + count + ".");
        //                             }
        //                             break; //done, so get next word
        //                         }
        //                     }
        //                 }
        //                 for (int k = 0; k < size; k++)
        //                 {
        //                     if (paramWordIsAPalindrome)
        //                     {
        //                         if (word.indexOf(wordThatIsBeingChecked.substring(k, k + 1)) == -1)
        //                         {
        //                             break; //stop the loop for checking in word, and get a new word
        //                         }
        //                         else if (k == (size - 1))
        //                         {
        //                             if (!wordsThatMatch.contains(wordThatIsBeingChecked))
        //                             {
        //                                 wordsThatMatch.add(wordThatIsBeingChecked);
        //                                 word = word.replaceFirst(word.substring(k, k + 1), "0");
        //                                 count++;
        //                                 System.out.println("(Line 216): The word " + wordThatIsBeingChecked + " will be added." + " The number of words found so far is now " + count + ".");
        //                             }
        //                             break; //done, so get next word
        //                         }
        //                     }
        //                     else if (!(paramWordIsAPalindrome))
        //                     {
        //                         if (wordThatIsBeingChecked.indexOf(word.substring(k, k + 1)) == -1)
        //                         {
        //                             break; //stop the loop for checking in word, and get a new word
        //                         }
        //                         else if (k == (size - 1))
        //                         {
        //                             if (!wordsThatMatch.contains(wordThatIsBeingChecked))
        //                             {
        //                                 wordsThatMatch.add(wordThatIsBeingChecked);
        //                                 word = word.replaceFirst(word.substring(k, k + 1), "0");
        //                                 count++;
        //                                 System.out.println("(Line 234): The word " + wordThatIsBeingChecked + " will be added." + " The number of words found so far is now " + count + ".");
        //                             }
        //                             break; //done, so get next word
        //                         }
        //                     }
        //                 }
        //             }
        //             else
        //             {
        //                 continue; //the size of words.get(i) != word, so get the next word.
        //             }
        //         }
        //         System.out.println();
        //         return wordsThatMatch;
        //     }
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
                if (words.get(i).indexOf(part.substring(j, size)) == -1)
                {
                    break;
                }
                else if (j == (size - 1))
                {
                    wordsThatMatch.add(words.get(i));
                    count++;
                    System.out.println("The word " + words.get(i) + " will be added." + " The number of words found so far is now " + count + ".");
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
