package FreshCut;


public class Weight
{
    int[] data;

    public Weight(int[] init)
    {
        data = new int[init.length];

        for (int j =0; j < init.length; j++)
        {
            data[j] = init[j];
        }

    }

    public void print()
    {
        for(int j = 0; j < data.length; j++)
        {
            System.out.println("Index " + j + " is " + data[j]);
        }

    }
    
    public int average()
    {
        int sum = 0;
        for( int j = 0; j < data.length; j++)
        {
            sum = sum + data[j];
        }
        int average = sum / data.length;
        return average;
    }

}
