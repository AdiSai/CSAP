package IntroCompsci;


import java.util.Scanner;
class WhatsMyName{
    public static void main (String [] args){

        String firstName;
        String lastName;

        Scanner scan = new Scanner( System.in);

        System.out.println("What is your first name?");
        firstName = scan.nextLine();
        
        System.out.println("What is your last name?");
        lastName = scan.nextLine();
       
        
        String fullName = new String(firstName + " " + lastName);
        System.out.println("Your full name seems to be " + fullName);


    }
}