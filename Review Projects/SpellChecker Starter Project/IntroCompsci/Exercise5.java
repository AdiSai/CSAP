package IntroCompsci;

import java.util.Scanner;
class Exercise5{
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("What are the last two digits of your birth year?");
        int inputYear = scan.nextInt();

        System.out.println("What are the last two digits of the current year?");
        int currentYear = scan.nextInt();

        int rawCalc = currentYear - inputYear;
        int finalCalc = rawCalc + 100;

        if ( rawCalc <= 0){

            System.out.println("You are " + finalCalc + " years old.");

        }
        else
        {
            System.out.println("You are " + rawCalc + " years old.");
        }
    }
}