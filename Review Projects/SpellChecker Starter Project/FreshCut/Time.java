package FreshCut;


public class Time
{
    private int hours;
    private int mins;

    public Time(int h1, int m1)
    {
        hours = h1;
        mins = m1;
        if(h1 > 23 || h1 < 0)
        {
            hours = 0;
            mins = 0;
            System.out.println("Error. Invalid hours");
        }
        if(m1 > 59 || m1 < 0)
        {
            hours = 0;
            mins = 0;
            System.out.println("Error. Invalid minutes");
        }
    }

    private int toMins()
    {
        return hours * 60 + mins;
    }

    public boolean equals(Time other)
    {
        if(this.hours == other.hours && this.mins == other.mins)
        {
            return true;
        }
        return false;
    }
    
    public String toString()
    {
        return hours + ":" + mins;
    }

    public int elapsedSince(Time t)
    {
        if(this.toMins() > t.toMins())
        {
            return this.toMins() - t.toMins();
        }
        else
        {
            return this.toMins() +( (24*60)- t.toMins());
        }

    }
}
