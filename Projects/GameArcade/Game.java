
/**
 * Write a description of class Game here.
 * 
 * @author (Adithya Sairamachandran) 
 * @version (a version number or a date)
 */
public class Game extends Object
{
    // instance variables - replace the example below with your own
    private int score;
    private int count;
    public String gameName;
    public String playerName;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        score = 0;
        count = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void increaseScore(int additional)
    {
        score = score + additional;
    }
    public void reduceScore(int penalty)
    {
        if (score > penalty)
        {
            score = score - penalty;
        }
        else
        {
            score = 0;
        }
    }
    public void nextRound()
    {
        count++;
    }
    public int getScore()
    {
        return score;
    }
    public String toString()
    {
        if (count == 1)
        {
            return (super.toString() + "\n" + "After " + count + " round of " + gameName + ", the final score is " + score);
        }
        return (super.toString() + "\n" + "After " + count + " rounds of " + gameName + ", the final score is " + score);
    }
}
