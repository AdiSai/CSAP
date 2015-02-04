package IntroCompsci;


import java.util.Scanner;
class BonusLoop{
    public static void main (String [] args){
        // Created by: Varun Sathyan  2nd Hour

        Scanner scan = new Scanner(System.in);
        int i =0;
        System.out.println("How many rows do you want?");
        int rowNum = scan.nextInt();

        int loopRowNum = rowNum + 1;

        for(i=1; i<loopRowNum; i++){
            System.out.println("##"+i+"##---##"+ (loopRowNum-i) + "##---##" + i+ "##");
        }


    }
}