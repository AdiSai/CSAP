package IntroCompsci;

import java.util.Scanner;
class WaitTime{
    public static void main (String [] args){
        
        Scanner scanny = new Scanner(System.in);
        
        System.out.println("What is the current hour?");
        int currentHour = scanny.nextInt();
        
        System.out.println("how many minutes past the hour is it?");
        int currentMinute = scanny.nextInt();
        
        System.out.println("What is your departure hour?");
        int departureHour = scanny.nextInt();
        
        System.out.println("What are your departure minutes?");
        int departureMinute = scanny.nextInt();
       
    
        int waitTimeTotalMinuteCalc = (departureHour-currentHour)*60 + (departureMinute-currentMinute);
        int waitTimeHourCalc = waitTimeTotalMinuteCalc/60;
        int waitTimeMinuteCalc = waitTimeTotalMinuteCalc%60;
        
        System.out.println(" You have " + waitTimeHourCalc + " hours and " + waitTimeMinuteCalc + " minutes to wait.");
        
        
        
    }
}
