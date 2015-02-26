/**
 * Write a description of class Billfold here.
 * @author (Adithya Sairamachandran) 
 * @version (2/26/15)
 */
public class Billfold
{
    // instance variables - replace the example below with your own
    private Card card1;
    private Card card2;

    /**
     * Constructor for objects of class Billfold
     */
    public Billfold()
    {
        // initialise instance variables
        card1 = null;
        card2 = null;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addCard(Object o)
    {
        if (o instanceof Card)
        {
            Card other = (Card)o;
            if (card1 == null)
            {
                card1 = other;
            }
            else if (card2 == null)
            {
                card2 = other;
            }
        }
    }
    //     public void removeCard(int cardNum)
    //     {
    //         if (!((card1 == null) || (card2 == null)))
    //         {
    //             if (cardNum == 1)
    //             {
    //                 if (!(card1 == null))
    //                 {
    //                     card1 = null;
    //                 }
    //             }
    //             if (cardNum == 2)
    //             {
    //                 if (!(card2 == null))
    //                 {
    //                     card2 = null;
    //                 }
    //             }
    //         }
    //     }
    public int getExpiredCardCount()
    {
        int count = 0;
        if (!((card1 == null) || (card2 == null)))
        {
            if (card1.isExpired())
            {
                count++;
            }
            else if (card2.isExpired())
            {
                count++;
            }
        }
        return count;
    }
    public String formatCards()
    {
        if (!((card1 == null) && (card2 == null)))
        {
            return (card1.format() + "\n" + "\n" + card2.format());
        }
        else
        {
            return "";
        }
    }
}