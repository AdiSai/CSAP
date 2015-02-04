package APCS;

import java.util.*;
public class TriangleNumber
{

    public int triangleCalc(int n)
    {
        if( n==1)
        {
            return 1;
        }
        return n + triangleCalc(n-1);
    }

    public static void main(String[] args)
    {

        TriangleNumber input = new TriangleNumber();
        System.out.println(input.triangleCalc(5));
        System.out.println(input.pyramidCalc(2));
        

    }
    public int pyramidCalc(int n)
    {
        if( n==1)
        {
            return 1;
        }
        return pyramidCalc(n-1) + triangleCalc(n);
    }

    
    
    }
   

