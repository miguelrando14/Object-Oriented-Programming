public class Enrollment 
{
    //atributes

    private String seminarGroup;
    private Student student;
    private Course course;

    //constructor

    public Enrollment (String s)
    {
        s = seminarGroup;
        //student = new Student(n, N);
        //course = new Course(c);
    }

    public void addStudent(Student s)
    {
        student = s;
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
