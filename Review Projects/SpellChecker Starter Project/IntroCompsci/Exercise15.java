package IntroCompsci;

import java.util.Scanner;
class Exercise15{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the tire pressure of the front right tire?");
        int frontRightTire = scan.nextInt();
        
        if (frontRightTire > 45 || frontRightTire < 35){
            System.out.println("Warning: Tire Pressure out of range.");
        }
        

        System.out.println("What is the tire pressure of the front left tire?");
        int frontLeftTire = scan.nextInt();
         
        if (frontLeftTire > 45 || frontLeftTire < 35){
            System.out.println("Warning: Tire Pressure out of range.");
        }

        System.out.println("What is the tire pressure of the back left tire?");
        int backLeftTire = scan.nextInt();
         
        if (backLeftTire > 45 || backLeftTire < 35){
            System.out.println("Warning: Tire Pressure out of range.");
        }

        System.out.println("What is the tire pressure of the back right tire?");
        int backRightTire =  scan.nextInt();
         
        if (backRightTire > 45 || backRightTire < 35){
            System.out.println("Warning: Tire Pressure out of range.");
        }
        int diffFrontTireOrig = frontRightTire-frontLeftTire;
        int diffFrontTireFinal = Math.abs(diffFrontTireOrig);
        int diffBackTireOrig = backRightTire -backLeftTire;
        int diffBackTireFinal = Math.abs(diffBackTireOrig);

        if (diffFrontTireFinal <= 3 && diffBackTireFinal <= 3){
            System.out.println("Your tire inflation is good!");
        }
        else
        {
            if (diffFrontTireFinal > 3 && diffBackTireFinal <= 3 ){
                System.out.println("Your tire inflation is not good. Check the front tires.");
            }
            else if (diffBackTireFinal > 3 && diffFrontTireFinal <= 3 ){
                System.out.println("Your tire inflation is not good. Check the back tires.");
            }
            else{
                System.out.println("Your tire inflation is not good. Check both the front and back tires.");
            }
        }
        
    }
}