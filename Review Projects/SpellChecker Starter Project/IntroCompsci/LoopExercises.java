package IntroCompsci;

import java.util.Scanner;
class LoopExercises{
    public static void main (String [] args){

        //Exercise 0

        Scanner scan = new Scanner(System.in);/*

        System.out.println("What is your starting value?");
        int startValue = scan.nextInt();

        System.out.println("What is your ending value?");
        int endValue = scan.nextInt();

        for(int i = startValue; i<endValue+1; i++){

            System.out.println(i);
        }
        
        //Exercise 1
        
        /*System.out.println("Enter a word:");
        String word = scan.nextLine();
        
        for(int w = 0; w < word.length(); w++){
            System.out.println(word);
        }
        */
        //Exercise 2
        /*System.out.println("Enter first word");
        String word1 = scan.nextLine();
        
        System.out.println("Enter second word");
        String word2 = scan.nextLine();
        
        System.out.print(word1);
        
        int length1 = word1.length();
        int length2 = word2.length();
        
        int finalLength = length1+length2;
        
        for(int l=0; l<30-finalLength; l++){
            System.out.print(".");
        }
        
        System.out.print(word2);
         */
        //Exercise 3
        /*
        System.out.println("How many integers will be added:");
        int intAmount = scan.nextInt();
        
        int i=0;
       
        int finalInt=0;
        for(i=0; i<intAmount; i++){
            System.out.println("Enter an integer");
            int integers1 = scan.nextInt();
            finalInt = integers1 + finalInt;
            
            
        }
        
        System.out.println(finalInt);
        */
        
       // Exercise 4
       /*
       
       System.out.println("What is the upper limit?");
       int b = scan.nextInt();
       
      
       
       int i =0;
       int sqrd= 0;
       int cubed =0;
       
       for(i=b; i>=0; i--){
           sqrd = ((b-i)*(b-i)) + sqrd;
           cubed = ((b-i)*(b-i)*(b-i)) + cubed;
        }
        System.out.println("Sum of squares is " + sqrd + "  The sum of cubes is " + cubed); 
        */
       //Exercise 5
       /*
       System.out.println("What is X?");
       int x = scan.nextInt();
       System.out.println("What is n?");
       int n = scan.nextInt();
       
       int i = 0;
       int multiplier=1;
       
       for(i=0; i<n; i++){
           multiplier = x * multiplier;
        }
        System.out.println(" x to the nth power is " + multiplier);
       */
      // Exercise 6
      /*
      System.out.println("Enter the monthly payment: ");
      int monthPay = scan.nextInt();
      
      double creditOwed = 1000;
      int i = 0;
      double interest =0;
      int totalpayment =0;
      double finalBalance = 0;
      
      for(i=0; creditOwed>0; i++){
          System.out.println("\tMonth: " + i);
          interest = creditOwed * .015;
          creditOwed = (creditOwed - monthPay)+ interest;
          System.out.print("\t balance: " + creditOwed);
          totalpayment = monthPay * (i+1);
          System.out.print("      \t\t total payments: " + totalpayment);
        }
        */
       // Exercise 7
       /*
       double effectiveness = 100;
       int i=0;
       int monthNum=20;
    
       for(i =0; effectiveness>50; i++)
       {
           System.out.println("Month: " + i);
           effectiveness = effectiveness * .96;
           System.out.println("\t " + effectiveness);
           if( effectiveness<50){
               System.out.print(" Discarded");
               monthNum=i;
            }
        }
        */
       // Exercise 8
       /*
       
       System.out.println("What is the initial number of stars?");
       int starNum = scan.nextInt();
       int i =0;
       int b =0;
       
       for(i=starNum; i>0; i--){
           System.out.println();
           for(b=starNum; b>0; b--){
               System.out.print("*");
               
            } 
            starNum = starNum-1;
        }
        */
       // Exercise 9
       
       System.out.println("What is the size of the tree?");
       int treeSize = scan.nextInt();
       int i=0;
       int b =0;
       int x =0;
       int z = 0;
       int spacesLoop = treeSize-1; 
       for(i=treeSize; i>0; i--){
           System.out.println();
           for(x=spacesLoop; x>0; x--){
               System.out.print(" ");
            }
           for(b=0; b<1+z; b++){
               System.out.print("*");
            }
           
            treeSize = treeSize-1;
            spacesLoop = spacesLoop-1;
            z = z+2;
        }
        System.out.println("\n      ***\n      ***\n      ***");
   



    }
    
}
