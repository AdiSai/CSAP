
/**
 * Write a description of class VideoGame here.
 * 
 * @author (Adithya Sairamachandran) 
 * @version (a version number or a date)
 */
public class PCGame extends Game
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class PCGame
     */
    public PCGame()
    {
        // initialise instance variables
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setGameName(String gName)
    {
        // put your code here
        gameName = gName;
    }
    public void reloadScene()
    {
        //to be called after a round is played.
        super.nextRound();
    }
    public String toString()
    {
        return (super.toString() + ", for ");
    }
}
