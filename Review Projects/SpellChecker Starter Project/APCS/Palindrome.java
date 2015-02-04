package APCS;



public class Palindrome
{
    public boolean palinTest(String s)
    {
        s = s.replaceAll(" "," ").toUpperCase();
        int n = s.length();
        if(n==1 || n==0)
        {
           return true;
        }
        if(n==3 && s.substring(0,1).equals(s.substring(2,3)))
        {
            return true;
        }
        if(s.substring(0,1).equals(s.substring(n-2,n-1)))
        {
            s = s.substring(1,n-2);
            return palinTest(s);
        }
        else
        {
            return false;
        }
    }
}
