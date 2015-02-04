package BigBucks;

import java.util.*;
public class BankAccountTester
{
    public static void main (String[] args)
    {
        ArrayList<BankAccount> b1 = new ArrayList<BankAccount>();
        
        Scanner scan = new Scanner(System.in);
        
        while ( true)
        {
            System.out.println("Enter Account name: ");
            String name = scan.nextLine();
            if(name.equals("exit"))
            {
                break;
            }
            
            System.out.println("Enter the amount of the depsit");
            double balance = scan.nextDouble();
            System.out.println();
            scan.nextLine();
            
            BankAccount bA1 = new BankAccount(name, balance);
            
            b1.add(bA1);
        }
        

        BankAccount bank1 = b1.get(0);
       
        
        for(int i = 1; i < b1.size(); i++)
        {
            
            
            
            BankAccount compareBank = b1.get(i);
            
           if(compareBank.getBalance() > bank1.getBalance())
           {
              bank1 = compareBank;
            
           }
           
           
        }
        
        System.out.println("The highest balance is $" + bank1.getBalance() +
        " and it belongs to " + bank1.getName());
        
      /*  System.out.println("1. Deposit \n 2. Withdraw /n 3. Print max \n 4. Exit");
        int choice = scan.nextInt();
        
        if(choice > 4 || choice < 1)
        {
           System.out.println("Invalid Choice");
        }
        
        if(choice == 1)
        {
            System.out.println("Enter a deposit");
            */
        
       
            
          
            
        
        
    }
}
