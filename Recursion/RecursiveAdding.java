
/**
 * Write a description of class Adding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class RecursiveAdding //server class
{
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int add (int n)
    {
        if (n == 1) //base case
        {
            return 1;
        }
        else
        {
            return n + add(n-1); //recursive call
        }
    }
    
    public static void main(String[] args) //client class
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scan.nextInt();
        RecursiveAdding a = new RecursiveAdding();
        int added = a.add(n);
        System.out.println(added);
    }
}
