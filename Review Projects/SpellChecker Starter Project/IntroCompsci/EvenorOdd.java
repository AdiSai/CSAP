package IntroCompsci;

import java.util.Scanner;

class EvenorOdd{
    public static void main (String [] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number?");
        int inputNumber = scan.nextInt();

        int remainder = inputNumber%2;
        if (remainder == 0){

            System.out.println("The number " + inputNumber + " is even.");
        }
        else{
          System.out.println("The number " + inputNumber + " is odd.");  
        }
        
       



    }
}