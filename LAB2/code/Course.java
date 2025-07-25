import java.util.LinkedList;
public class Course 
{
    private String name;
    private LinkedList<Enrollment> enrollment;
    private LinkedList<Assigment> assigment;
    private LinkedList<Lecture> lecture;
  
    //constructor
    public Course (String n)
    {
        name = n;
        enrollment = new LinkedList<Enrollment>();
        assigment = new LinkedList<Assigment>();
        lecture = new LinkedList<Lecture>();

    }

    //methods
    public String getName()
    {
        return name;
    }
    public void addEnrollment(Enrollment e)
    {
        enrollment.add(e);
    }

    public void addAssigment(Assigment a)
    {
        assigment.add(a);
    }

    public void addLecture (Lecture a)
    {
        lecture.add(a);
    }

    public String toString()
    {
        return name;
    }
}
