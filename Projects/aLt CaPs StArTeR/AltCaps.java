
import java.util.*;

public class AltCaps
{
    Scanner sc;

    public AltCaps()
    {
        sc = new Scanner(System.in);
    }

    public String altCaps(String str)
    {
       String modify = ""; String finalstr = ""; String space =" ";
       for (int i = 0; i < str.length(); i++)
       {
           if (i % 2 == 0)
           {
               if (str.substring(i, i + 1).equals(space))
               {
                   modify = str.substring(i + 1, i + 2);
                   modify = modify.toLowerCase();
                   finalstr = finalstr + space + modify;
               }
               else
               {
                   modify = str.substring(i, i + 1);
                   modify = modify.toLowerCase();
                   finalstr = finalstr + modify;
               }
           }
           else
           {
               if (str.substring(i, i + 1).equals(space))
               {
                   modify = str.substring(i + 1, i + 2);
                   modify = modify.toUpperCase();
                   finalstr = finalstr + space + modify;
               }
               else
               {
                  modify = str.substring(i, i + 1);
                  modify = modify.toUpperCase();
                  finalstr = finalstr + modify;
               }
           }
       }
        return finalstr;
    }

    public static void main(String[] args)
    {
        AltCaps ac = new AltCaps();
        System.out.println("Welcome to the AlT CaPs Converter.");

        while (true)
        {
            System.out.print("Enter a string to convert: (Enter to quit) ");
            String input = ac.sc.nextLine();
            if ( input.equals("") )
                break;
            System.out.println("\n"+input+" in AlT CaPs is "+ac.altCaps(input) );

        }
    }
}

