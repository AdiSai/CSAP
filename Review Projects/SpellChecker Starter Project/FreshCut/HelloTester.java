package FreshCut;

import java.util.Scanner;
public class HelloTester
{
    public static void main (String [] args)
    {
        /*Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter greeting ");
        String greeting = scan.nextLine();
        */
        
        
        HelloObject ob1 = new HelloObject("Hi");
        HelloObject ob2 = new HelloObject("Hi");
        
        System.out.println(ob1);
        System.out.println(ob2);
        //ob1.speak();
        //ob1.morningSpeak();
        //ob1.eveningSpeak();
        
        if(ob1.equals(ob2))
        {
            System.out.println("=");
        }
        else
        {
            System.out.println("Not = ");
        }
        
       
    }
}