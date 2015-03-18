
/**
 * Write a description of class PinballTester here.
 * 
 * Adithya Sairamachandran
 * @version (a version number or a date)
 */
import java.util.*;
public class PinballTester
{
    public static void run(String playerName)
    {
        PinballGame theGame = new PinballGame();
        theGame.setPlayerName(playerName);
        theGame.setTheGamesName();
        //theGame.reloadScene();
        System.out.println(theGame);
    }
}
