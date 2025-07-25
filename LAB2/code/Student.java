import java.util.LinkedList;

public class Student 
{
    private String name;
    private int nia;
    private LinkedList<Enrollment> enrollment;

    //constructor
    public Student (String n, int num)
    {
        name = n;
        nia = num;
        enrollment = new LinkedList<Enrollment>();
    }

    //method
    public void addEnrollment(Enrollment e)
    {
        enrollment.add(e);
    }

    public int getNia()
    {
        return nia;
    }

    public void setNia(int n)
    {
        nia = n;
    }

    public LinkedList<String> getCourses ()
    {
        LinkedList<String> courses = new LinkedList<String>();
        int i = 0;
        while(i<enrollment.size())
        {
            courses.add(enrollment.get(i).getCourseName());
            i++;
        }

        return courses;

    }

    public String toString()
    {
        return name;
    }
}
