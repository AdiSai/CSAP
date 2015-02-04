package FreshCut;


public class Box
{
    //Created By: Varun Sathyan    
    private double length;
    private double width;
    private double height;

    public Box(double l, double w, double h)
    {
        length = l;
        width = w;
        height = h;
    }

    public Box( Box oldBox)
    {
        length = oldBox.length;
        width = oldBox.width;
        height = oldBox.height;

    }

    public Box( double s)
    {
        length = s;
        width = s;
        height = s;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public Box biggerBox()
    {
        double newLength = 1.25 * length;
        double newWidth = 1.25 * width;
        double newHeight = 1.25 * height;

        Box b = new Box(newLength, newWidth, newHeight);
        return b;
    }

    public Box smallerBox()
    {
        double newLength = .75 * length;
        double newWidth = .75 * width;
        double newHeight = .75 * height;

        Box b = new Box(newLength, newWidth, newHeight);
        return b;
    }

    public double volume()
    {
        return length * width * height;
    }

    public double area()
    {
        return (length * width) * 2 + (height * width) *2 + (height * length) * 2;
    }

    public boolean nests(Box outsideBox)
    {
        if(this.width > outsideBox.width && this.length > outsideBox.length && this.height > outsideBox.height)

        {
            return true;
        }
        return false;
    }

}
