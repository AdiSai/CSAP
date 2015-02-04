package FreshCut;


public class BoxTester
{
    public static void main (String[] args)
    {
        Box box = new Box(4, 5.0, 6.0);
        Box box2 = new Box(3);
        
        Box box3 = box.biggerBox();

        System.out.println("Area: " + box3.area() + " volume: " + box3.volume());
        System.out.println("length " + box3.getLength() + " height: " + box3.getHeight() + 
            " width: " + box3.getWidth());

        if( box.nests(box2))
        {
            System.out.println("Nests");
        }
        else
        {
            System.out.println("No Nesting");
        }

        box.biggerBox();
        
        
    }
}
