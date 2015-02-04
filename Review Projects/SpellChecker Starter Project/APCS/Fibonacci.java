package APCS;



public class Fibonacci
{
    // instance variables - replace the example below with your own
 public int fibonacci(int n)
    {
        if( n==1)
        {
            return 0;
        }
        if( n==2)
        {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
