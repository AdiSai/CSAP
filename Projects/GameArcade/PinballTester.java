
/**
 * Write a description of class PinballTester here.
 * 
 * Adithya Sairamachandran
 * @version (a version number or a date)
 */
import java.util.*;
public class PinballTester
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name.");
        String playerName = scan.nextLine();
        PinballGame theGame = new PinballGame();
        theGame.setPlayerName(playerName);
        theGame.setTheGamesName();
        //theGame.reloadScene();
        System.out.println(theGame);
    }
}
