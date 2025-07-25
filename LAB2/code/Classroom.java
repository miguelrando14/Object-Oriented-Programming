import java.util.LinkedList;

public class Classroom 
{
    private String code;
    private LinkedList<Lecture> lecture;
    

    //constructor
    public Classroom (String c)
    {
        code = c;
        lecture = new LinkedList<Lecture>();
    }

    public void addLecture (Lecture a)
    {
        lecture.add(a);
    }

    public String toString()
    {
        return code;
    }
}
