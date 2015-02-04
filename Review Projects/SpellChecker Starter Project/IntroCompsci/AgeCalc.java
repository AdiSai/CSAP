package IntroCompsci;

import java.util.Scanner;
class AgeCalc
{
    public static void main (String[] args)
    {
        final int year = 2014;
        final int month = 2;
        final int day = 13;
        
        Scanner scanboy = new Scanner(System.in);
        
        System.out.println("What year were you born in?");
        int inputYear = scanboy.nextInt();
        
        System.out.println("What month are you born in?");
        int inputMonth = scanboy.nextInt();
        
        System.out.println("What day were you born in?");
        int inputDay = scanboy.nextInt();
        
        
        int monthCalc = ((year - inputYear)*12)+(month-inputMonth);
        int dayCalc = (monthCalc*30)+(day - inputDay);
        int hourCalc = dayCalc*24;
        
        System.out.println("You are " + monthCalc + " months old.");
        System.out.println("You are also " + dayCalc + " days old.");
        System.out.println("You are additionally " + hourCalc + " hours old.");

    }
}