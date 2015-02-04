package IntroCompsci;


import java.util.Scanner;
class Amit{
public static void main (String [] args){
Scanner scan = new Scanner(System.in);
System.out.println("How many potatoes did Amit plant today?");
int amitsPotato = scan.nextInt();

if (amitsPotato >= 8){
System.out.println("I guess Amit has enough food to live another day");
}
else{
System.out.println("I guess Amit will have to go hungry again!");
}
}
}