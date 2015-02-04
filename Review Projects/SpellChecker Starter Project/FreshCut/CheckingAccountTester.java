package FreshCut;


public class CheckingAccountTester
{
    public static void main (String [] args)
    {
        CheckingAccount c1 = new CheckingAccount("Bob", "123", 100);
        CheckingAccount c2 = new CheckingAccount("Bob", "123", 100);
        //System.out.println(c1.accountNumber + " " + c1.accountName + " " + c1.currentBalance);
        System.out.println(c1);
        c1.withdraw(100);
        c1.printInfo();
        if(c1.equals(c2))
        {
            System.out.println("=");
        }
        else
        {
            System.out.println("Not = ");
        }
        
    }
}
