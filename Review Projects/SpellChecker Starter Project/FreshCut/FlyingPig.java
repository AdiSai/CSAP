package FreshCut;



public class FlyingPig
{
 double wingspan;
 double facialHairAmt;
 double resemblanceToAmit;
 double skinColor;
 String race;
 String name;
   public FlyingPig(double wS, String s)
   {
       wingspan = wS;
       name = s;
       
   }
   
    public void print()
    {
        System.out.print("Name is " + name + " and wingspan is " + wingspan);
    }
    
    public void flap( int timesFlapped){
        for(int i=0; i<timesFlapped; i++){
        System.out.println("Flappy");
    }
    }
}
