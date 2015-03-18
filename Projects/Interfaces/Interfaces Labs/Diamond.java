
/**
 * Write a description of class Diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamond implements Comparable<Diamond>
{
    // instance variables - replace the example below with your own
    private String stockNumber;
    private double caret; //size
    private String clarity; //calrity
    private char color; //color (D - Z)
    private String cut; //cut name

    /**
     * Constructor for objects of class Diamond
     */
    public Diamond(String sn, double crt, String clar, char colr, String diamondCut)
    {
        // initialise instance variables
        if (checkValidArgs(clar, colr))
        {
            stockNumber = sn;
            caret = crt;
            clarity = clar;
            color = colr;
            cut = diamondCut;
        }
        else
        {
            stockNumber = sn;
            caret = crt;
            clarity = "I3";
            color = 'Z';
            cut = diamondCut;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param clar Diamond clarity
     * @param col Diamond Color
     * @return     true or false
     */
    public boolean checkValidArgs(String clar, char colr)
    {
        String[] correctClarities = {"FL", "IF", "VVS1", "VVS2", "VS1", "VS2", "SI1", "SI2", "I1", "I2", "I3"};
        char[] correctColors = {'D', 'E', 'F', 'G', 'H', 'I', 'H', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = 0; i < correctClarities.length; i++)
        {
            if (clar.equals(correctClarities[i]))
            {
                for (int j = 0; j < correctColors.length; j++)
                {
                    if (colr == correctColors[j])
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public String getStock() { return stockNumber; }
    public double getCaret() { return caret; }
    public String getClarity() { return clarity; }
    public char getColor() { return color; }
    public String getCut() { return cut; }
    public int getClarityAsAnInt()
    {
        String[] clarities = {"FL", "IF", "VVS1", "VVS2", "VS1", "VS2", "SI1", "SI2", "I1", "I2", "I3"};
        for (int i = 0; i < clarities.length; i++)
        {
            if (clarity.equals(clarities[i])) //if clarity equals what's at the curr array index
            {
                return i; //return the curr aray index
            }
        }
        throw new IllegalStateException("Something bad has occured... The instance variable clarity does not contain a proper value.");
    }
    public int compareTo(Diamond other)
    {
        if (this.caret < other.caret)
        {
            return 1;
        }
        else if (this.caret > other.caret)
        {
            return -1;
        }
        else //0
        {
            if (this.getClarityAsAnInt() > other.getClarityAsAnInt())
            {
                return 1;
            }
            else if (this.getClarityAsAnInt() < other.getClarityAsAnInt())
            {
                return -1;
            }
            else //0
            {
                if (this.color > other.color)
                {
                    return 1;
                }
                if (this.color < other.color)
                {
                    return -1;
                }
                else //0
                {
                    return 0; //equal
                }
            }
        }
    }
    public String toString()
    {
        return ("Stock number: " + stockNumber + ", Caret: " + caret + ", Calrity: " + clarity + ", Color: " + color + ", Cut: " + cut);
    }
}
