package FreshCut;



public class PigTester
{
    public static void main(String [] args){
        
        FlyingPig p1 = new FlyingPig(5, "Jeeves");
        FlyingPig p2 = new FlyingPig(8, "Kobe");
        p1.print();
        p1.flap(6);
    }
}
