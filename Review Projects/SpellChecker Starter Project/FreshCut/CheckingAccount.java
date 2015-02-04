package FreshCut;


public class CheckingAccount
{
    private String accountName;
    private String accountNumber;
    private double currentBalance;

    public CheckingAccount(String name, String number, double balance)
    {
        accountName = name;
        accountNumber = number;
        currentBalance = balance;
    }

    public void printInfo()
    {
        System.out.println("Name: " + accountName + " Number: " + accountNumber + " Balance: " + currentBalance);
    }

    public String changeName(String newName)
    {
        accountName = newName;
        return newName;
    }

    public String changeName()
    {
        accountName = "Jeever Beaver";
        return "Jeever Beaver";
    }

    public void deposit(double deposition)
    {
        currentBalance = currentBalance + deposition;
        System.out.println("Your new balance is " + currentBalance);
    }
    
    public double getBalance()
    {
        return currentBalance;
    }
    
    public void withdraw(double withdrawDat)
    {
        currentBalance = currentBalance - withdrawDat;
        System.out.println("Your new balance is " + currentBalance);
    }
    
    public String toString()
    {
        return  "Name: " + accountName + " Number: " + accountNumber + " Balance: " + currentBalance;
    }
    
    public boolean equals(CheckingAccount jeever)
    {
        if(accountNumber.equals(jeever.accountNumber))
        {
            return true;
        }
        return false;
    }

}
