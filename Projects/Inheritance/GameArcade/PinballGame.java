
/**
 * Write a description of class Pinball here.
 * 
 * @author (Adithya Sairamachandran) 
 * @version (a version number or a date)
 */
public class PinballGame extends PCGame
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Pinball
     */
    public PinballGame()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setPlayerName(String pName)
    {
        // put your code here
        playerName = pName;
    }
    public void setTheGamesName()
    {
        super.setGameName("Pinball");
    }
    public String toString()
    {
        return (super.toString() + "player " + playerName + ".");
    }
}
