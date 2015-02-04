import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

/**
 * Used as a tester for SpellChecker.
 * 
 * @author Josh Pudaloff
 * @version 12/2013
 */
public class SpellCheckTester
{
    public static Scanner picker = new Scanner(System.in); 
    public static SpellChecker spellCk = new SpellChecker(); 

    public static void main (String[] args) throws IOException
    { 

        System.out.println("Welcome to the Spell Checker. Current words known: "+ spellCk.numberOfWords() );

        // main program loop
        while (true) 
        {
            int choice = printMenu();
            if (choice == 10)
            {
                spellCk.save();
                break;
            }
            switch (choice)
            {
                case 1: checkWord();
                break;
                case 2: checkWords();
                break;
                case 3: checkFile();
                break;
                case 4: checkPrefix();
                break;
                case 5: checkContaining();
                break;
                case 6: insertWord();
                break;
                case 7: removeWord();
                break;
                case 8: isPalindrome();
                break;
                case 9: showAnas();
                break;
                default: System.out.println("Huh?");
            }
        }

    }

    public static int printMenu()
    {
        System.out.println("Please enter the number of your selection:");
        System.out.println("1. Check if a word is in the dictionary.");
        System.out.println("2. Check if a group of words are in the dictionary.");
        System.out.println("3. Spell check a file (if you have a file).");
        System.out.println("4. Search for all words with a given prefix.");
        System.out.println("5. Search for all words containing some text.");
        System.out.println("6. Insert a word in to the dictionary.");
        System.out.println("7. Remove a word from the dictionary.");
        System.out.println("8. Check if a word or phrase is a palindrome.");
        System.out.println("9. Search for all anagrams of a word.");
        System.out.println("10. Exit.");
        int ch = picker.nextInt();
        picker.nextLine(); // flush the buffer
        return ch;

    }  // end of main()

    public static void checkWord()
    {
        System.out.print("Enter word to check: ");
        String wrd = picker.nextLine();

        if ( spellCk.isKnownWord(wrd) )
            System.out.println("\nThat word IS in the dictionary\n");
        else
            System.out.println("\nThat word IS NOT in the dictionary\n");
    }

    public static void checkWords()
    {
        System.out.print("Enter words to check one at a time. "
            + "\nEnter to finish: ");
        String next = picker.nextLine();
        ArrayList<String> wrds = new ArrayList<String>();
        while (!next.equals(""))
        {
            wrds.add(next);
            next = picker.nextLine();
        }
        if ( wrds.size() > 0 && spellCk.allKnown(wrds) )
            System.out.println("\nAll words ARE in the dictionary.\n");
        else
            System.out.println("\nAll words ARE NOT in the dictionary.\n");
    }

    public static void checkFile() throws IOException
    {
        // this Scanner is used to read what the user enters
        Scanner user = new Scanner( System.in ); 
        String  fileName;

        System.out.print("File Name (Should be in current directory): ");
        fileName = user.nextLine().trim();
        File file = new File( fileName);     // create a File object
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> notWords = new ArrayList<String>();

        // this Scanner is used to read from the file
        Scanner scan = new Scanner( file );   
        int count=0;

        while ( scan.hasNext() )   // is there more data to process? 
        {
            String next = scan.next();
            next = next.replaceAll("[^A-Za-z]", "");  //remove punctuation

            if (spellCk.isKnownWord(next))
            {
                words.add(next);
                ArrayList<String> palins = new ArrayList<String>();
                if (spellCk.isPalindrome(next) && next.length()>2)
                {
                    palins.add(next);
                    System.out.println("\nPalindrome found: " + next);
                }
                ArrayList<String> anas = spellCk.anagrams(next);
                if (anas.size() > 0 && next.length()>2)
                {
                    System.out.print("\nAnagram(s) found. All known anagrams of "+next+": ");
                    for (String s: anas)
                        System.out.print(s +"\t");
                }
            }
            else
            {
                notWords.add(next);
            }
        }
        System.out.println("Print known words? ");
        String c = picker.nextLine();
        if (c.toLowerCase().contains("y"))
        {
            System.out.println("Known words in text: ");
            for (String word: words)
            {
                System.out.print(word+"\t");
                count++;

                if (count > 5)
                {
                    System.out.println();
                    count = 0;
                }
            }
        } 
        System.out.println("\nPrint unknown words? ");
        c = picker.nextLine();
        if (c.toLowerCase().contains("y"))
        {
            count = 0;
            System.out.println("Unknown words: (Enter 'x' anytime to exit)");
            for (String s: notWords)
            { 
                count = 0;
                System.out.print("\n"+s+"  is UNKNOWN, Do you want to add "+s+" to the dictionary?");
                String choice = user.nextLine();
                if (choice.toLowerCase().contains("y"))
                {
                    spellCk.insert(s);
                    spellCk.save();
                }
                else if (choice.toLowerCase().contains("x") )
                {
                    return;
                }
            }
        }

        //             System.out.print("\nThe word " +next);
        //             if (spellCk.isKnownWord(next)) 
        //             {
        //                 count++;
        //                 System.out.print(" is KNOWN\t");
        //                 if (count > 5)
        //                 {
        //                     System.out.println();
        //                     count = 0;
        //                 }
        //             }
        //             else 
        //             {
        //                 count = 0;
        //                 System.out.print("\n"+next+"  is UNKNOWN, Do you want to add "+next+" to the dictionary?");
        //                 String choice = user.nextLine();
        //                 if (choice.toLowerCase().contains("y"))
        //                 {
        //                     spellCk.insert(next);
        //                     spellCk.save();
        //                 }
        //             }

        //        }

    }

    public static void checkPrefix()
    {
        System.out.print("Enter prefix to check: ");
        ArrayList<String> prefixFound = new ArrayList<String>();
        String pre = picker.nextLine();
        prefixFound = spellCk.wordsStartingWith(pre);
        if (prefixFound.size() == 0)
            System.out.println("None found :(");
        for (String word: prefixFound)
            System.out.println(word);
    }

    public static void checkContaining()
    {
        System.out.print("Enter text to check: ");
        ArrayList<String> wordsFound = new ArrayList<String>();
        String entered = picker.nextLine();
        wordsFound = spellCk.wordsContaining(entered);
        if (wordsFound.size() == 0)
            System.out.println("None found :(");
        for (String word: wordsFound)
            System.out.println(word);
    }

    public static void insertWord()
    {
        System.out.print("Enter word to insert: ");
        String word = picker.nextLine();
        spellCk.insert(word);
        spellCk.save();

    }

    public static void removeWord()
    {
        System.out.print("Enter word to remove: ");
        String word = picker.nextLine();
        if (spellCk.remove(word))
            System.out.println("Success.");
        else
            System.out.println("Not successfully removed.");
        spellCk.save();

    }

    public static void showAnas()
    {
        System.out.print("Enter word to check: ");
        String word = picker.nextLine();
        ArrayList<String> anasFound = new ArrayList<String>();
        anasFound = spellCk.anagrams(word);
        if (anasFound.size() == 0)
            System.out.println("None found.");
        else 
        {
            for (String ana: anasFound)
                System.out.println(ana);
        }

    }

    public static void isPalindrome()
    {
        System.out.print("Enter word to check: ");
        String word = picker.nextLine();
        System.out.print(word +" is ");
        if (!spellCk.isPalindrome(word))
            System.out.println("not ");
        System.out.println(" a palindrome.");

    }

}
