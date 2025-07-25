public class Lecture 
{
    private String group;
    private int timeSlot;
    private int type;
    private Classroom classroom;
    private Course course;

    //constructor
    public Lecture (int s, int t, String g)
    {
        group = g;
        timeSlot = s;
        type = t;
        //classroom = new Classroom(cl);
        //course = new Course(co);
    }

    public void addClassroom(Classroom c)
    {
        classroom = c;
    }

    public void addCourse (Course c)
    {
        course = c;
    }

    
}
