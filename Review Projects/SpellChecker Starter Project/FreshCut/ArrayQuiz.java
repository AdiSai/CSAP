package FreshCut;


public class ArrayQuiz
{
    public static void main (String [] args)
    {
        //Created by: Varun Sathyan (Hour 2)
        int[] signal = {1, 3, 7, 2, 6, 6, 3, 2, 5, 4, 1, 5};

        int[] smooth = new int[signal.length];

        for(int i = 0; i < signal.length; i++)
        {
            System.out.println("Signal[" + i + "] = " + signal[i]);
        }

        for(int i = 0; i < signal.length; i++)
        {
            if( i == 0)
            {
                smooth[i] = (signal[i] + signal[i+1]) / 2;
            }
            else if(i == signal.length - 1)
            {
                smooth[i] = (signal[i] + signal[i-1])/2;
            }
            else
            {

                smooth[i] = (signal[i-1] + signal[i] + signal[i+1])/3;
            }
        }

        for(int i = 0; i < smooth.length; i++)
        {
            System.out.println("Smooth[" + i + "] = " + smooth[i]);
        }
    }
}
