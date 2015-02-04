package FreshCut;


import java.util.*;
public class TestTime
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int h, m;
        Time illegal1 = new Time(17, 60);  //should make 0:0
        Time illegal2 = new Time(24, 16);  //should make 0:0
        System.out.println("Should be 0:0 - "+illegal1);
        System.out.println("Should be 0:0 - "+illegal2);

        System.out.print(" Enter first time (e.g. 22 45): " );
        h = s.nextInt();
        m = s.nextInt();
        Time t1 = new Time(h, m);

        System.out.print(" Enter second time: " );
        h = s.nextInt();
        m = s.nextInt();
        Time t2 = new Time(h, m);

        if (t1.equals(t2))
            System.out.println("You entered the same time");
        else
            System.out.println("The times are not the same, so...");
        int x;
        x = t2.elapsedSince(t1);
        System.out.println(x+ " minutes elapsed from "+t1+" to "+t2+".");
    }
}

