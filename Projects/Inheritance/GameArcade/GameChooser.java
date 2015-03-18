
/**
 * Write a description of class GameChooser here.
 * 
 * Adithya Sairamachandran
 * @version (a version number or a date)
 */
import java.util.*;
public class GameChooser
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int choice;
        int count = 0;
        String name = "";
        final String dashes = new String(new char[78]).replace("\0", "-");
        while (true)
        {
            if (count == 0)
            {
                System.out.println("Enter your name.");
                name = scan.nextLine();
                printMenu();
                choice = scan.nextInt();
                if (choice == 0)
                {
                    if (count == 1)
                    {
                        System.out.println(name + " has played " + count + " round, within the Game Arcade.");
                    }
                    else
                    {
                        System.out.println(name + " has played " + count + " rounds, within the Game Arcade.");
                    }
                    break;
                }
                if (choice == 1)
                {
                    System.out.println();
                    count++;
                    PinballTester.run(name);
                    continue;
                }
                if (choice == 2)
                {
                    System.out.println();
                    count++;
                    PacmanTester.run(name);
                    continue;
                }
                if (choice != 0 || choice != 1 || choice != 2)
                {
                    if (count == 1)
                    {
                        System.out.println(name + " has played " + count + " round, within the Game Arcade.");
                    }
                    else
                    {
                        System.out.println(name + " has played " + count + " rounds, within the Game Arcade.");
                    }
                    System.exit(0);
                }
            }
            else
            {
                System.out.println(dashes); //make output cleaner
                printMenu();
                choice = scan.nextInt();
                if (choice == 0)
                {
                    if (count == 1)
                    {
                        System.out.println(name + " has played " + count + " round, within the Game Arcade.");
                    }
                    else
                    {
                        System.out.println(name + " has played " + count + " rounds, within the Game Arcade.");
                    }
                    break;
                }
                if (choice == 1)
                {
                    System.out.println();
                    count++;
                    PinballTester.run(name);
                    continue;
                }
                if (choice == 2)
                {
                    System.out.println();
                    count++;
                    PacmanTester.run(name);
                    continue;
                }
                if (choice != 0 || choice != 1 || choice != 2)
                {
                    if (count == 1)
                    {
                        System.out.println(name + " has played " + count + " round, within the Game Arcade.");
                    }
                    else
                    {
                        System.out.println(name + " has played " + count + " rounds, within the Game Arcade.");
                    }
                    System.exit(0);
                }
            }
        }
    }

    static void printMenu()
    {
        System.out.println();
        System.out.println("Enter the choice of the game you want to play.");
        System.out.println("0: Exit");
        System.out.println("1: Pinball");
        System.out.println("2: Pacman");
    }
}
