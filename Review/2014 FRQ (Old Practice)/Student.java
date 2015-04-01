
/**
 * Write a description of class Student here.
 * 
 * Adithya Sairamachandran
 * @version (a version number or a date)
 */
public class Student implements Comparable<Student>
{
    private String name;
    private int absences;
    public Student(String nm)
    {
        name = nm;
        absences = 0;
    }
    public Student(String nm, int abs)
    {
        name = nm;
        absences = abs;
    }

    public int compareTo(Student other)
    {
        if (this.absences > other.absences)
        {
            return 1;
        }
        if (this.absences < other.absences)
        {
            return -1;
        }
        return 0; //equal
    }
    public int getAbsenceCount()
    {
        return absences;
    }
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return name + " " + absences;
    }
}
