package APCS;


public class Log
{
    // instance variables - replace the example below with your own
  public double logCalc(int n)
  {
      if(n==1)
      {
          return 0;
        }
        return 1 + logCalc(n/2);
    }
  
    public static void main(String[] args)
    {
        Log l = new Log();
        
        System.out.println(l.logCalc(32));
    }
 
}
