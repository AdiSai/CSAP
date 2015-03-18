
/**
 * Write a description of class PacmanTester here.
 * 
 * Adithya Sairamachandran
 * @version (a version number or a date)
 */
import java.util.*;
public class PacmanTester
{
    public static void run(String playerName)
    {
        PacmanGame theGame = new PacmanGame();
        theGame.setPlayerName(playerName);
        theGame.setTheGamesName();
        //theGame.reloadScene();
        System.out.println(theGame);
    }
}
