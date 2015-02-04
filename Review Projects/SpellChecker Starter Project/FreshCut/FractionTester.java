package FreshCut;



public class FractionTester
{
    // instance variables - replace the example below with your own
    public static void main (String[] args)
    {
        Fraction noGo = new Fraction(2,0);
        Fraction f1 = new Fraction (7,11);
        System.out.println("Fraction f1 is " + f1);
        Fraction f2 = new Fraction (6,9);
        System.out.println("Fraction f2 is " + f2);
        Fraction f3 = new Fraction(2,3);
        System.out.println("Fraction f3 is " + f3);
        
        if(f2.equals(f3))
        {
            System.out.println("They are equal");
        }
        else
        {
            System.out.println("They are not equal");
        }
        
        Fraction sumf1f2 = f1.add(f2);
        System.out.println("f1 + f2 equals " + sumf1f2);
        
        Fraction productf2f3 = f2.multiply(f3);
        System.out.println("f1 X f2 is " + productf2f3);
        
        
    }
}
