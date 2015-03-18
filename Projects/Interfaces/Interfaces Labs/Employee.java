
/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee implements Comparable<Employee>
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int birthYear;
    public Employee(String first, String last, int yr)
    {
        firstName = first;
        lastName = last;
        birthYear = yr;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getName() { return firstName + ", " + lastName; }
    public String getFormalName() { return lastName + ", " + firstName; }
    public int getBirthYear() { return birthYear; }
    public int compareTo(Employee other)
    {
        if (this.lastName.compareTo(other.lastName) > 0)
        {
            return 1;
        }
        else if (this.lastName.compareTo(other.lastName) < 0)
        {
            return -1;
        }
        else //0
        {
            if (this.firstName.compareTo(other.firstName) > 0)
            {
                return 1;
            }
            else if (this.firstName.compareTo(other.firstName) < 0)
            {
                return -1;
            }
            else //0
            {
                if (this.birthYear > other.birthYear) //if 1955 < 1933 (true)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        }
    }
    public String toString()
    {
        return getFormalName() + " Born: " + birthYear;
    }
}
