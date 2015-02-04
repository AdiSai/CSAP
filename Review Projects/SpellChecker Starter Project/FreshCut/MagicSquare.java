package FreshCut;

import java.util.*;

public class MagicSquare 
{
    public static int[][] magic;

    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Magic square (must be odd): ");
        int n = s.nextInt();
        if (n % 2 == 0) throw new RuntimeException("N must be odd");

        magic = new int[n][n];

        int startRow = 0;
        int startCol = (n-1) / 2;
        magic[startRow][startCol] = 1;

        for(int i = 1; i < n * n; i++)
        {
            int prevRow = startRow;
            int prevCol = startCol;
            
            startRow--;
            if(startRow < 0)
            {
                startRow = n -1;
            }
            
            startCol++;
            if(startCol > n-1)
            {
                startCol = 0;
            }
            
            if(magic[startRow][startCol] == 0)
            {
                prevRow = startRow;
                prevCol = startCol;
                magic[prevRow][prevCol] = i + 1;
            }
            else
            {
                startRow = prevRow + 1;
                if(startRow > n-1)
                {
                    startRow = 0;
                }
                startCol = prevCol;
                magic[startRow][startCol] = i + 1;
            }

          
            
        }

        /*# 
         *   YOUR CODE HERE!!!!!
         *   HAVE FUN !!!!!
         */ 

        // prints out results will align up to 3 digit #s
        // Not necessary to modify below this line!
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (magic[i][j] < 10)  
                    System.out.print(" "); // extra space for alignment
                if (magic[i][j] < 100) 
                    System.out.print(" ");  // extra space for alignment
                System.out.print(magic[i][j] + " ");
            }
            System.out.println();
        }

    }
}

