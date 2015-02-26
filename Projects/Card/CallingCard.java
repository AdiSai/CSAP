/**
 * Write a description of class CallingCard here.
 * @author (Adithya Sairamachandran) 
 * @version (2/26/15)
 */
public class CallingCard extends Card
{
    // instance variables - replace the example below with your own
    private int pin;

    /**
     * Constructor for objects of class CallingCard
     */
    public CallingCard(String name, int p)
    {
        // initialise instance variables
        super(name);
        pin = p;
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
        return (super.format() + "\n" + "Pin: " + pin);
    }
    public String toString()
    {
        return (super.toString() + "\n" + "[Pin: " + pin + "]");
    }
    public boolean equals(Card other)
    {
        if (super.equals(other))
        {
            CallingCard o = (CallingCard)other;
            if (this.pin == (o.pin))
            {
                return true;
            }
        }
        return false;
    }
}