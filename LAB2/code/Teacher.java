import java.util.LinkedList;

public class Teacher 
{
    //atributes
    private String name;
    private LinkedList<Assigment> assigment;

    //constructor
    public Teacher (String n)
    {
        name = n;
        assigment = new LinkedList<Assigment>();
    }

    public void addAssigment(Assigment a)
    {
        assigment.add(a);
    }

    public LinkedList<String> getCourses()
    {
        LinkedList<String> t_courses = new LinkedList<String>();
        int i = 0;
        while(i<assigment.size())
        {
            t_courses.add(assigment.get(i).getCourseName());
            i++;
        }

        return t_courses;
        
    }

    public String toString()
    {
        return name;
    }
}
