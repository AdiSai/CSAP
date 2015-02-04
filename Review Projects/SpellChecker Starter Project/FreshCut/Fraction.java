package FreshCut;


public class Fraction 
{
    // Instance variables (fields):
    private int num;
    private int denom;

    // Constructors:
    public Fraction(int n, int d)
    {
        if (d == 0)
        {
            System.out.println("Fraction construction error: denominator is 0");
            num = 0;
            denom = 1;
        }
        else
        {
            num = n;
            denom = d;
            reduce();
        }
    }
    
    public Fraction()
    {
        num = 0;
        denom = 1;
    }
    
    public Fraction(int n)
    {
        num = n;
        denom = 1;
    }
    

    public Fraction(Fraction other)  // Copy constructor
    {
        num = other.num;
        denom = other.denom;
    }
    
    /*#
     *  missing constructors
     */

    // Public methods:
    public Fraction add(Fraction other)
    {
        int newNum = num * other.denom + denom * other.num;
        // ABOVE COULD BE:
        // int newNum = this.num * other.denom + this.denom * other.num;
        int newDenom = denom * other.denom;
        // ABOVE COULD BE:
        //int newDenom = this.denom * this.other.denom;
        Fraction f = new Fraction(newNum, newDenom);
        return f;
    }
    
    public Fraction subtract(Fraction other)
    {
        int newNum = num * other.denom - other.num * denom;
        
        int newDenom = denom * other.denom;
        
       Fraction f = new Fraction(newNum, newDenom);
       return f;
    }
    
    public Fraction multiply(Fraction other)
    {
            if(other.denom != 0)
        {
        int newNum = num * other.num;
        
        int newDenom = denom * other.denom;
        
        Fraction f = new Fraction(newNum, newDenom);
        return f;
    }
    else
    {
        Fraction w = new Fraction(num, denom);
        return w;
        
    }
    }
    
    public Fraction divide(Fraction other)
    {
        if(other.num != 0)
        {
        int newNum = num * other.denom;
        
        int newDenom = denom * other.num;
        
        Fraction f = new Fraction(newNum, newDenom);
        return f;
    }
    else
    {
        Fraction w = new Fraction(num, denom);
        return w;
        
    }
    }
       
    public boolean equals(Fraction other)
    {
        if(this.num == other.num && this.denom == other.denom)
        {
            return true;
        }
        return false;
    }

    /**#
     * < ... missing methods: subtract, multiply, and divide >
     */ 
    
    /*#
     * DO NOT EDIT BELOW THIS LINE, READ IF CURIOUS
     */
    public double getValue()
    {
        return (double)num / (double)denom;
    }

    public String toString()
    {
        return num + "/" + denom;
    }

    // Static methods:
    public static Fraction valueOf(double x)
    {
        int n = (int) (x * 10000 + .5);
        int d = 10000;
        return new Fraction(n, d);
    }

    /**
     *  Returns the greatest common factor of two positive integers
     *  Precondition: n, d > 0
     */
    public static int gcf(int n, int d)
    {
        if (n <= 0 || d <= 0)
        {
            System.err.println("Fraction.gcf precondition failed: " + n + ", " + d);
            return 1;
        }
        int r = n % d;
        if (r == 0)
            return d;
        else
            return gcf(d, r); 
    }
    
    // Private methods:
    private void reduce()
    {
        if (num == 0)
        {
            denom = 1;
            return;
        }

        if (denom < 0)
        {
            num = -num;
            denom = -denom;
        }

        int q = gcf(Math.abs(num), denom);
        num /= q;
        denom /= q;    
    }
    
}
