package BigBucks;


public class BankAccount
{
    private String name;
    private double balance;
    
    public BankAccount (String nm, double amt)
    {
        name = nm;
        balance = amt;
    }
    
    public void deposit(double dp)
    {
        if(dp > 0)
        {
            balance = dp + balance;
        }
        else
        {
            System.out.println("Invalid deposit. Enter positive number.");
            
        }
    }
    
    public void withdraw( double wd)
    {
        if(wd > 0)
        {
            balance = balance - wd;
        }
        else
        {
            System.out.println("Invalid withdrawal. Enter positive number.");
            
        }
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
   
           
        
}
