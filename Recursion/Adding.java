
/**
 * Write a description of class Adding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Adding
{
    public int makeTriangle(int n)
    {
        if (n == 1) //base case
        {
            return 1;
        }
        return n + makeTriangle(n - 1); //recurrsive call
    }
    public int makePyramid(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        return makeTriangle(n) + makePyramid(n - 1);
    }
    public int fibonacci(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        if (n == 2)
        {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public int factorial (int n)
    {
        if (n == 1 || n == 0)
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }
    }
    public double e(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        return ((1 / factorial(n - 1)) +  e (n-1));
    }
    public int log(int n)
    {
        if (n == 1)
        {
            return 0;
        }
        return 1 + log(n/2);
    }
    public boolean palindrome(String str)
    {
        if (str.length() == 0 || str.length() == 1)
        {
            return true;
        }
        String first = str.substring(0, 1);
        String last = str.substring(str.length() - 1);
        if(first.equals(last))
        {
            return (palindrome(str.substring(1, str.length() - 1)));
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        Adding a = new Adding();
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        int n; String st;
        while (true)
        {
            System.out.println("\n" + "Please choose an option from below:");
            System.out.println("0: Make a Triangle");
            System.out.println("1: Make a Pyramid");
            System.out.println("2: Fibonacci");
            System.out.println("3: Factorial");
            System.out.println("4: E");
            System.out.println("5: Log");
            System.out.println("6: Palindrome");
            System.out.println("7: Exit");
            choice = scan.nextInt();
            if (choice == 0 || choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7)
            {
                if (choice == 0)
                {
                    System.out.println("Please enter the value for n (in the triangle).");
                    n = scan.nextInt();
                    System.out.println(a.makeTriangle(n));
                }
                if (choice == 1)
                {
                    System.out.println("Please enter the value for n (in the pyramid).");
                    n = scan.nextInt();
                    System.out.println(a.makePyramid(n));
                }
                if (choice == 2)
                {
                    System.out.println("Please enter the number to caluculate fibonacci's sequence on.");
                    n = scan.nextInt();
                    System.out.println(a.fibonacci(n));
                }
                if (choice == 3)
                {
                    System.out.println("Please enter the value to get the factorial of.");
                    n = scan.nextInt();
                    System.out.println(a.factorial(n));
                }
                if (choice == 4)
                {
                    System.out.println("Please enter the number to caluclate e from.");
                    n = scan.nextInt();
                    System.out.println(a.e(n));
                }
                if (choice == 5)
                {
                    System.out.println("Please enter the number to caluclate the log of.");
                    n = scan.nextInt();
                    System.out.println(a.log(n));
                }
                if (choice == 6)
                {
                    System.out.println("Please enter the String to check wether or not it is a palindrome.");
                    st = scan.next();
                    if (a.palindrome(st) == true)
                    {
                        System.out.println("Yes: " + st + " is a palindrome.");
                    }
                    else
                    {
                        System.out.println("No: " + st + " is not a palindrome.");
                    }
                }
                if (choice == 7)
                {
                    break;
                }
            } 
            else if (choice != 0 || choice != 1 || choice != 2 || choice != 3 || choice != 4 || choice != 5 || choice != 6 || choice != 7)
            {
                System.out.println(choice + " is not a valid option.");
            }
        }
        System.exit(0);
    }
    }
