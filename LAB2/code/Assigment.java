import java.util.LinkedList;

public class Assigment
 {
    //atributes
    private LinkedList<String> groups;
    private Teacher teacher;
    private Course course;

    //construct
    public Assigment (LinkedList<String> g)
    {
        groups = new LinkedList<String>(g);
    }

    public void addTeacher(Teacher t)
    {
        teacher = t;
    }

    public void addCourse (Course c)
    {
        course = c;
    }

    public String getCourseName()
    {
       return course.getName();
    }



}
