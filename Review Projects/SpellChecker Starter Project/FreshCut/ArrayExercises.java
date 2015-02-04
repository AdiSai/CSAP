package FreshCut;

class ArrayExercises
{
    public static void main(String [] args)
    {
        //Exercise 0
        /*
        int[] valA = { 13 ,-22, 82, 17};
        int[] valB = {-12, 24, -79, -13};
        int[] sum = new int[valA.length];

        for(int i = 0; i < sum.length; i++)
        {
        sum[i] = valA[i] + valB[i];
        }

        for(int i = 0; i < sum.length; i++)
        {
        System.out.println("Sum " + i + " is " + sum[i]);
        }
         */
        //Exercise 1
        /*
        int[] data = { 3, 2, 5, 7, 9, 12, 97, 24, 54};
        int evenSum = 0;
        int oddSum = 0;
        int sum = 0;
        int average = 0;
        for(int index = 0; index < data.length; index++)
        {
        sum = sum + data[index];

        if(data[index]% 2 == 0)
        {
        evenSum = evenSum + data[index];
        }
        else
        {
        oddSum = oddSum + data[index];
        }
        }
        average = sum/data.length;
        System.out.println("Sum: " + sum + " Average: " + average + " Even sum: " + evenSum + 
        " Odd Sum: " + oddSum);

         */
        //Exercise 2
        /*
        int[] data = {3, 1, 5, 7, 4, 12, 3, 8, 2};

        int largest = data[0];
        int smallest = data[0];

        for( int index = 1; index < data.length; index++)
        {
        if(data[index] > largest)
        {
        largest = data[index];
        }
        if(data[index] < smallest)
        {
        smallest = data[index];
        }

        }
        System.out.println("Largest: " + largest + " Smallest: " + smallest);
         */
        // Exercise 3
        /*
        int[] data = {1, -7, 3, 4, 5, 6, 7, 8, 42, 155, 11, 12, 13,-20};
        int [] result = new int[data.length];

        for(int index = data.length - 1; index >= 0; index--)
        {
        result[data.length - (index + 1)] = data[index];

        }

        for(int j=0; j < result.length; j++)
        {
        System.out.println("Data[" + j + "] = " + data[j]);

        }

        for(int j=0; j < result.length; j++)
        {
        System.out.println("Result[" + j + "] = " + result[j]);

        }
         */
        // Exercise 4

        int[] data = {1, -7, 3, 4, 5, 6, 7, 8, 42, 155, 11, 12, 13,-20};

        for(int j=0; j < data.length; j++)
        {
            System.out.println("Data[" + j + "] = " + data[j]);

        }

        int loopLength = data.length;
        int number;

        for(int index =0; index < data.length / 2; index++)
        {
            number = data[index];
            data[index] = data[data.length - (index + 1)];
            data[data.length - (index + 1)] = number;

        }

        for(int j=0; j < data.length; j++)
        {
            System.out.println("Data[" + j + "] = " + data[j]);

        }

               
    }

}
