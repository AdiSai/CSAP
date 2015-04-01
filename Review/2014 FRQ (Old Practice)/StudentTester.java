import java.util.*;
/**
 * Write a description of class StudentTester here.
 * 
 * Adithya Sairamachandran
 * @version (a version number or a date)
 */
public class StudentTester
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Adi", 2));
        students.add(new Student("Bob", 3));
        students.add(new Student("Joe", 1));
        students.add(new Student("Dan", 7));
        students.add(new Student("Jack", 6));
        students.add(new Student("Mike", 5));
        students.add(new Student("Sam", 3));
        students.add(new Student("Dale", 4));
        students.add(new Student("Peter"));
        System.out.println(students + "\n");
        SeatingChart sc = new SeatingChart(students, 3, 3);
        System.out.println("Initial print:");
        sc.print();
        sc.removeAbsentStudents(5);
        System.out.println("After removing students with greater than 5 absences:");
        sc.print();
    }
}
