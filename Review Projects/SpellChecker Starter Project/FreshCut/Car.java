package FreshCut;


public class Car
{
    double startingMiles;
    double endMiles;
    double gallons;  

    public Car(double sM,double eM, double g)
    {
         startingMiles = sM;
         endMiles = eM;
         gallons = g;


    }
    
    public void print()
    {
        System.out.println("Starting miles: " + startingMiles + " End miles: " + endMiles + 
        " Gallons used: " + gallons);
    }
    
    public double milesPerGallon()
    {
        double miles = (endMiles - startingMiles)/ gallons;
        return miles;
    }
    
    public boolean gasHog()
    {
        if (milesPerGallon() < 5.0)
        {
            return true;
        }
        return false;
    }
    
    public boolean economyCar()
    {
        if (milesPerGallon() > 30.0 )
        {
            return true;
        }
        return false;
    }
    
    public void fillUp(double sM1, double eM1, double g1)
    {
        startingMiles = sM1;
        endMiles = eM1;
        gallons = g1;
        
    }
}
