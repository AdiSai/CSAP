package APCS;

public class GoogleBillboard2
{
    private static double answer; // this will hold your solution
    public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";

    public static void main(String args[])
    {
        int w = e.length();
        for (int i =0; i<w-10; i++ )
        {
            String s = e.substring(i, 10+i); 
            double n = Double.parseDouble(s);
            if( isPrime(n)==(true))
            {


               answer =  n;
               //System.out.println(answer);
                //this next line will just make your answer pretty
                String number = (""+answer).replace(".","");
                System.out.println(s);
                //Now print the number
               System.out.println("The number is: "+number);
            }

        }
    }

    public static boolean isPrime(double dNum)
    {
        double x = Math.sqrt(dNum);
        for(int i=2; i<x; i++)
        {
            if(dNum%i==0)
            {
                return false;
            }
            //to be finished later

        }
        return true;
    }
}

