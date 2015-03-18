import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) 
    {
        
        Word[] words = {new Word("freddy"), new Word("at"), new Word("elephant"),
            new Word("whoooooodat"), new Word("alice"), new Word("tommy"),
            new Word("bobby"), new Word("it"), new Word("at"), new Word("about"),};

  
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