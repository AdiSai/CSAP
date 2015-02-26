/**
 * Write a description of class IDCard here.
 * @author (Adithya Sairamachandran) 
 * @version (2/26/15)
 */
public class IDCard extends Card
{
    // instance variables - replace the example below with your own
    private String idNum;

    /**
     * Constructor for objects of class IDCard
     */
    public IDCard(String name, String id)
    {
        // initialise instance variables
        super(name);
        idNum = id;
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
        return (super.format() + "\n" + "ID number: " + idNum);
    }
    public String toString()
    {
        return (super.toString() + "\n" + "[ID Number: " + idNum + "]");
    }
    public boolean equals(Card other)
    {
        if (super.equals(other))
        {
            IDCard o = (IDCard)other;
            if (this.idNum.equals(o.idNum))
            {
                return true;
            }
        }
        return false;
    }
}