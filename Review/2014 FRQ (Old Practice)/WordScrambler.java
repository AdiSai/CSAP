import java.util.*;
/**
 * Write a description of class WordScrambler here.
 * 
 * Adithya Sairamachandran
 * @version (a version number or a date)
 */
public class WordScrambler
{
    /** Checks if a String is all upper case
     * @param s the String to check
     * @return boolean for if the String is all upper case
     */
    public static boolean isUpper(String s)
    {
        for(char c : s.toCharArray())
        {
            if(!Character.isUpperCase(c))
            {
                return false;
            }
        }
        return true;
    }
    /** Scrambles a given word.
     * @param word the word to be scrambled
     * @return the scrambled word (possibly equal to word)
     * Precondition: word is either an empty string or contains only uppercase letters.
     * Postcondition: the string returned was created from word as follows:
     * - the word was scrambled, beginning at the first letter and continuing from left to right
     * - two consecutive letters consisting of "A" followed by a letter that was not "A" were swapped
     * - letters were swapped at most once
     */
    public static String scrambleWord(String word) 
    {
        String temp = ""; String currSubs;
        int swapCount = 0;
        for (int h = 0; h < word.length(); h++)
        {
            temp = temp.toUpperCase();
            if (word.length() == 0)
            {
                return word;
            }
            else
            {
                if (h + 1 > word.length())
                {
                    break;
                }
                currSubs = word.substring(h, h+1);
                if (!(isUpper(currSubs)))
                {
                    throw new IllegalArgumentException("Precondition check failed.");
                }
            }
        }
        String s = ""; String nextSubs; 
        char[] wordChars = word.toCharArray();
        for (int i = 0; i < word.length(); i++)
        {
            if (i + 1 > word.length() || i + 2 > word.length())
            {
                break;
            }
            currSubs = word.substring(i, i+1);
            nextSubs = word.substring(i+1, i+2);
            if (currSubs.equals(nextSubs))
            {
                if (currSubs.equals("A") && nextSubs.equals("A"))
                {
                    if (wordChars[i] == wordChars[i + 1])
                    {
                        if (swapCount == 0)
                        {
                            char tempChar = wordChars[i + 1];
                            wordChars[i + 1] = wordChars[i + 2];
                            wordChars[i + 2] = tempChar;
                            swapCount++;
                        }
                    }
                }
            }
        }
        for (int j = 0; j < wordChars.length; j++)
        {
            s = s + wordChars[j];
        }
        return s;
    }
    /** Scrambles a given word.
     * @param word the word to be scrambled
     * @param matched one letter word to be matched
     * @return the scrambled word (possibly equal to word)
     * Precondition: word is either an empty string or contains only uppercase letters.
     * Postcondition: the string returned was created from word as follows:
     * - the word was scrambled, beginning at the first letter and continuing from left to right
     * - two consecutive letters consisting of Matched followed by a letter that was not Matched were swapped
     * - letters were swapped at most once
     */
    public static String scrambleWord(String word, String matched) 
    {
        String temp = ""; String currSubs;
        int swapCount = 0;
        for (int h = 0; h < word.length(); h++)
        {
            temp = temp.toUpperCase();
            if (word.length() == 0)
            {
                return word;
            }
            else
            {
                if (h + 1 > word.length())
                {
                    break;
                }
                currSubs = word.substring(h, h+1);
                if (matched.length() == 2 || (!(isUpper(matched))))
                {
                    throw new IllegalArgumentException("Precondition check failed.");
                }
                if (!(isUpper(currSubs)))
                {
                    throw new IllegalArgumentException("Precondition check failed.");
                }
            }
        }
        String s = ""; String nextSubs; 
        char[] wordChars = word.toCharArray();
        for (int i = 0; i < word.length(); i++)
        {
            if (i + 1 > word.length() || i + 2 > word.length())
            {
                break;
            }
            currSubs = word.substring(i, i+1);
            nextSubs = word.substring(i+1, i+2);
            if (currSubs.equals(nextSubs))
            {
                if (currSubs.equals(matched) && nextSubs.equals(matched))
                {
                    if (wordChars[i] == wordChars[i + 1])
                    {
                        if (swapCount == 0)
                        {
                            char tempChar = wordChars[i + 1];
                            wordChars[i + 1] = wordChars[i + 2];
                            wordChars[i + 2] = tempChar;
                            swapCount++;
                        }
                    }
                }
            }
        }
        for (int j = 0; j < wordChars.length; j++)
        {
            s = s + wordChars[j];
        }
        return s;
    }
    /** Modifies wordList by replacing each word with its scrambled
     * version, removing any words that are unchanged as a result of scrambling.
     * @param wordList the list of words
     * Precondition: wordList contains only non-null objects
     * Postcondition:
     * - all words unchanged by scrambling have been removed from wordList
     * - each of the remaining words has been replaced by its scrambled version
     * - the relative ordering of the entries in wordList is the same as it was
     * before the method was called
     */
    public static void scrambleOrRemove(List<String> wordList) 
    {
        String wd = ""; String wdm = "";
        for (int i = 0; i < wordList.size(); i++)
        {
            wd = wordList.get(i);
            wdm = scrambleWord(wd);
            if (wd.equals(wdm))
            {
                wordList.remove(wd);
            }
        }
    }
}
