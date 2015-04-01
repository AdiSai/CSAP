import java.util.*;
/**
 * Write a description of class WordScrambler here.
 * 
 * Adithya Sairamachandran
 * @version (a version number or a date)
 */
public class WordScramblerTester
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        WordScrambler ws = new WordScrambler();
        List<String> wordList = new ArrayList<String>();
        wordList.add("JACKAAB");
        wordList.add("ADISAIAAB");
        wordList.add("ABCDEFGHIJKLM");
        wordList.add("ABNNAAC");
        System.out.println("Before: " + wordList);
        ws.scrambleOrRemove(wordList);
        System.out.println("After: " + wordList);
    }
}
