/**
 * Write a description of class DriversLicence here.
 * @author (Adithya Sairamachandran) 
 * @version (2/26/15)
 */
import java.util.*;
public class DriversLicence extends Card
{
    // instance variables - replace the example below with your own
    private int expYear;

    /**
     * Constructor for objects of class DriversLicence
     */
    public DriversLicence(String n, int e)
    {
        // initialise instance variables
        super(n);
        expYear = e;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String format()
    {
        // put your code here
        return (super.format() + "\n" + "Experation Year: " + expYear);
    }
    public String toString()
    {
        return (super.toString() + "\n" + "[Experation Year: " + expYear + "]");
    }
    public int getCurrYear()
    {
        GregorianCalendar cal = new GregorianCalendar();
        int currYear = cal.get(Calendar.YEAR);
        return currYear;
    }
    public boolean isExpired(Object o)
    {
        if (o instanceof DriversLicence)
        {
            DriversLicence other = (DriversLicence)o;
            GregorianCalendar cal = new GregorianCalendar();
            int currYear = cal.get(Calendar.YEAR);
            System.out.println(currYear);
            if (currYear > expYear)
            {
                return true;
            }
        }
        return false;
    }
    public boolean equals(Card other)
    {
        if (super.equals(other))
        {
            DriversLicence o = (DriversLicence)other;
            if (this.expYear == (o.expYear))
            {
                return true;
            }
        }
        return false;
    }
}