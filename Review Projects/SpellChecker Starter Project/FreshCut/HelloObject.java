package FreshCut;



public class HelloObject
{
    String greeting;
    
    public HelloObject(String g)
    {
            greeting = g;
    }
    
    public void speak()
    {
        int i=0;
        for(i=0; i<greeting.length(); i++){
        System.out.println(greeting);
    }
    }
    
    public void morningSpeak()
    {
        System.out.println(greeting + ". Good morning World!");
    }
    public void eveningSpeak()
    {
        System.out.println(greeting + ". Good evening World!");
    }
    
    public String toString()
    {
        return "Your greeting was " + greeting;
    }
    
    public boolean equals(HelloObject jeeves)
    {
        if( greeting.equals(jeeves.greeting))
        {
            return true;
        }
        return false;
    }
}
