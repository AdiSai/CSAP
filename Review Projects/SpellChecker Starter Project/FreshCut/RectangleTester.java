package FreshCut;

public class RectangleTester
{
    public static void main(String[] args)
    {
        //Test constructors
        Rectangle r1 = new Rectangle(0,2);
        System.out.print("Output should be width: 1 height: 1 - ");
        System.out.println(r1);
        Rectangle r2 = new Rectangle(2,-1);
        System.out.print("Output should be width: 1 height: 1 - ");
        System.out.println(r2);
        Rectangle r3 = new Rectangle(-2);
        System.out.print("Output should be width: 1 height: 1 - ");
        System.out.println(r3);
        Rectangle r4 = new Rectangle(3,4);
        System.out.print("Output should be width: 3 height: 4 - ");
        System.out.println(r4);
        Rectangle r5 = new Rectangle(5);
        System.out.print("Output should be width: 5 height: 5 - ");
        System.out.println(r5);
        Rectangle r6 = new Rectangle();
        System.out.print("Output should be width: 1 height: 1 - ");
        System.out.println(r6);
        Rectangle r7 = new Rectangle(3,4);
        System.out.print("Output should be width: 3 height: 4 - ");
        System.out.println(r6);

        //Test methods-you need to write the methods so they match and work!
        boolean rectIsSquare = r5.isSquare();  
        if (rectIsSquare)
            System.out.println(r5+" is a square!");
        else
            System.out.println(r5+" is not a square.");
        boolean rectIsSquare2 = r7.isSquare();  
        if (rectIsSquare2)
            System.out.println(r7+" is a square!");
        else
            System.out.println(r7+" is not a square.");

        int area1 = r7.area();
        System.out.println("The area of "+r7+" is "+area1);
        int area2 = r5.area();
        System.out.println("The area of "+r5+" is "+area2);

        int perim1 = r7.perimeter();
        System.out.println("The perimeter of "+r7+" is "+perim1);
        int perim2 = r5.perimeter();
        System.out.println("The perimeter of "+r5+" is "+perim2);

        boolean fourIsSameAsSeven = r4.equals(r7);
        if ( fourIsSameAsSeven )
            System.out.println(r4+" is equal to "+r7);
        else
            System.out.println(r4+" is not equal to "+r7);
        boolean fourIsSameAsFive = r4.equals(r5);
        if ( fourIsSameAsFive )
            System.out.println(r4+" is equal to "+r5);
        else
            System.out.println(r4+" is not equal to "+r5);
    }
}
