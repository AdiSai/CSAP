package FreshCut;


public class Circle
{
    public double radius;
    
    public Circle(double r)
    {
        radius = r;
    }
    
    public double area()
    {
        return Math.PI * radius * radius;
    }
    
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
    
    public double diameter()
    {
        return 2 * radius;
    }
    public double radius()
    {
        return radius;
    }
   
}
