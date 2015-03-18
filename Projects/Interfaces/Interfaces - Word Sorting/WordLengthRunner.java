import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordLengthRunner
{
    public static void main( String args[] ) 
    {

        WordLength[] words = {new WordLength("freddy"), new WordLength("at"), new WordLength("elephant"),
                new WordLength("whoooooodat"), new WordLength("alice"), new WordLength("tommy"),
                new WordLength("bobby"), new WordLength("it"), new WordLength("at"), new WordLength("about"),};  
        out.println("Before:");
        for(int i = 0; i < words.length; i++)
        {
            System.out.println(words[i]);
        }
        Arrays.sort(words);  // only works if Comparable!!
        out.println("\n\nAfter:");
        for(int i = 0; i < words.length; i++)
        {
            System.out.println(words[i]);
        }
    }
}
