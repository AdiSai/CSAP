import java.util.*;
/**
 * Write a description of class SeatingChart here.
 * 
 * Adithya Sairamachandran
 * @version (a version number or a date)
 */
public class SeatingChart
{
    /** seats[r][c] represents the Student in row r and column c in the classroom. */
    private Student[][] seats;
    /** Creates a seating chart with the given number of rows and columns from the students in
     * studentList. Empty seats in the seating chart are represented by null.
     * @param rows the number of rows of seats in the classroom
     * @param cols the number of columns of seats in the classroom
     * Precondition: rows > 0; cols > 0;
     * rows * cols >= studentList.size()
     * Postcondition:
     * - Students appear in the seating chart in the same order as they appear
     * in studentList, starting at seats[0][0].
     * - seats is filled column by column from studentList, followed by any
     * empty seats (represented by null).
     * - studentList is unchanged.
     */
    public SeatingChart(List<Student> studentList, int rows, int cols)
    {
        if (rows > 0 && cols > 0 && ((rows * cols) >= studentList.size()))
        {
            seats = new Student[rows][cols];
            int studentListIndex = 0;
            for (int i = 0; i < rows; i++) //rows
            {
                for (int j = 0; j < cols; j++) //cols
                {
                    seats[i][j] = studentList.get(studentListIndex);
                    studentListIndex++;
                }
            }
        }
        else
        {
            throw new IllegalArgumentException("Precondition test failed.");
        }
    }

    /** Removes students who have more than a given number of absences from the
     * seating chart, replacing those entries in the seating chart with null
     * and returns the number of students removed.
     * @param allowedAbsences an integer >= 0
     * @return number of students removed from seats
     * Postcondition:
     * - All students with allowedAbsences or fewer are in their original positions in seat
     * - No student in seats has more than allowedAbsences absences.
     * - Entries without students contain null.
     */
    public int removeAbsentStudents(int allowedAbsences)
    {
        int count = 0;
        for (int i = 0; i < seats.length; i++) //rows
        {
            for (int j = 0; j < seats[0].length; j++) //cols
            {
                if (seats[i][j] != null && seats[i][j].getAbsenceCount() > allowedAbsences)
                {
                    seats[i][j] = null;
                    count++;
                }
            }
        }
        return count;
    }
    public void print()
    {
        for (int i = 0; i < seats.length; i++)
        {
            for (int j = 0; j < seats[i].length; j++)
            {
                if (!(seats[i][j] == null))
                {
                    System.out.println(seats[i][j]);
                }
            }
        }
        System.out.println();
    }
}
