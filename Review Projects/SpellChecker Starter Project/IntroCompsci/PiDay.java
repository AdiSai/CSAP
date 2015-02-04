package IntroCompsci;

class PiDay{
    public static void main(String [] args){

        double result =0;
        int numTerms = 100;
        double num = 1;
        double denom = 1;
        for(int i=1; i<=numTerms; i++){

            if(i%2 ==1){
                result = result + num/denom;

            }
            else{
                result = result - num/denom;

            }
            denom = denom+2;

        }
        result = result*4;
        System.out.println("Our result: \t" + result);
        
        System.out.println("Java PI value:\t" + Math.PI);



    }
}