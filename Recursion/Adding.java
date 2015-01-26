
/**
 * Write a description of class Adding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adding
{
    public int triangle(int n)
    {
        //base case
        if (n == 1)
        {
            return 1;
        }
        return n + triangle(n - 1); //recurrsive call
    }
    
    public static void man(String[] args)
    {
        Adding a = new Adding();
        a.triangle(5);
    }
}
