public class SelfDivisor
{
    /*** Part (a) ***/

    /** @param number the number to be tested
     *         Precondition: number > 0
     *  @return true if every decimal digit of number is a divisor of number;
     *          false otherwise
     */
    public static boolean isSelfDivisor(int number)
    {
        String temp = Integer.toString(number);
        int[] numArray = new int[temp.length()];
        //insert things into an array:
        for (int i = 0; i < temp.length(); i++)
        {
        	numArray[i] = temp.charAt(i) - '0';
        	System.out.println("Added:" +  numArray[i]);
        }
        //check array:
        for (int j = 0; j < numArray.length; j++)
        {
        	if (numArray[j] == 0)
        	{
        		return false;
        	}
        	else if (!(number % numArray[j] == 0))
            {
                return false;
            }
        }
        return true;
    }

    /*** Part (b) ***/

    /** @param start starting point for values to be checked
     *         Precondition: start > 0
     *  @param num the size of the array to be returned
     *         Precondition: num > 0
     *  @return an array containing the first num integers >= start that are self-divisors
     */
    public static int[] firstNumSelfDivisors(int start, int num)
    {
    	int[] values = new int[num];
    	int i = 0;
        while (true)
        {
            if (i > (num - 1)) //break when > than the last index of array size (num)
            {
            	break;
            }
        	if (isSelfDivisor(start)) 
            {
            	values[i] = start;
            	i++;
            }
            start++;
        }
        return values;
    }

    /****************/

    public static void main (String[] args)
    {
    	System.out.println("128: " + isSelfDivisor(128));
        System.out.println("26: " + isSelfDivisor(26));
        System.out.println("120: " + isSelfDivisor(120));
        System.out.println("102: " + isSelfDivisor(102));
    	for (int n : firstNumSelfDivisors(10, 3))
            System.out.print(n + " ");
        System.out.println();
    }
}
