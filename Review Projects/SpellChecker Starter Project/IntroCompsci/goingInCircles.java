package IntroCompsci;

import java.util.Scanner;
class goingInCircles{
    public static void main (String [] args){

        Scanner scan = new Scanner( System.in );
        double area;

        System.out.println("What is the area of your circle?_");
        area = scan.nextDouble();

        double radius = Math.sqrt(area/Math.PI);

        System.out.println("The radius of your cirle is " + radius);




    }
}