package APCS;


public class Euler
{
    
    public double euler(int n)
    {
       if (n==1 || n==0){
       return 1;
    }
    return n / factorial(n) + euler(n-1);
    }
    
    public double factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n * factorial(n-1);
    }
    
    public static void main(String[] args)
    {
        Euler e = new Euler();
        System.out.println(e.euler(12));
    }
}
