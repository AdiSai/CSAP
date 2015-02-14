
/**
 * Write a description of class PacmanTester here.
 * 
 * Adithya Sairamachandran
 * @version (a version number or a date)
 */
import java.util.*;
public class PacmanTester
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name.");
        String playerName = scan.nextLine();
        PacmanGame theGame = new PacmanGame();
        theGame.setPlayerName(playerName);
        theGame.setTheGamesName();
        //theGame.reloadScene();
        System.out.println(theGame);
    }
}
