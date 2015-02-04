package IntroCompsci;


import java.util.Scanner;
class NameReversal{
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your full name");
        String firstName = scan.nextLine();

     
      

        for(int i=firstName.length(); i > 0; i= i-1){
            String reverseName1 = firstName.substring(i-1,i);
            reverseName1 = reverseName1.toLowerCase();
            System.out.print(reverseName1);
           
    }
    
  
  


}
}