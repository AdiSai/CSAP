package FreshCut;

import java.util.Scanner;
public class CarTester
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What are your starting miles?");
        double startingMiles = scan.nextDouble();

        System.out.println("What are your ending miles?");
        double endMiles = scan.nextDouble();

        System.out.println("How many gallons did you use?");
        double gallons = scan.nextDouble();

        Car c1 = new Car(startingMiles, endMiles, gallons);

        c1.print();
        System.out.println("Miles per gallon is " + c1.milesPerGallon());

        if(c1.gasHog() == true)
        {
            System.out.println("Gas Hog!!");
        }
        if(c1.economyCar() == true)
        {
            System.out.println("Economy Car!");
        }

        System.out.println("Now it is time to fill up!");
        

        
            c1.fillUp(100,200,2);
            c1.print();
            System.out.println("Miles per gallon is " + c1.milesPerGallon());
        
         if(c1.gasHog() == true)
        {
            System.out.println("Gas Hog!!");
        }
        if(c1.economyCar() == true)
        {
            System.out.println("Economy Car!");
        }

    }
}
