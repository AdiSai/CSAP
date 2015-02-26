/**
 * Write a description of class Card here.
 * @author (Adithya Sairamachandran) 
 * @version (2/26/15)
 */
public class Card 
{ 
    private String name;

    public Card() 
    { 
        name = ""; 
    } 

    public Card(String n) 
    { 
        name = n; 
    } 
    
    public String getName() 
    { 
        return name; 
    } 
    public boolean isExpired() 
    { 
        return false; 
    } 
    public boolean equals(Object o)
    {
        if (o instanceof Card)
        {
            Card other = (Card)o;
            if (this.name.equals(other.name))
            {
                return true;
            }
        }
        return false;
    }
    public String format() 
    { 
        return "Card holder: " + name; 
    }
    public String toString()
    {
        String objToStr = super.toString();
        int indxOfAt = objToStr.indexOf("@");
        String toStrOfObjFinal = objToStr.substring(0, indxOfAt);
        return (toStrOfObjFinal + "\n" + "[Name: " + name + "]");
    }
}