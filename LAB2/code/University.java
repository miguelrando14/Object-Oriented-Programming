import java.util.LinkedList;

public class University 
{
    private LinkedList<Student> students;
    private LinkedList<Course> courses;
    private LinkedList<Teacher> teachers;
    private LinkedList<Classroom> classrooms;

    //constructor
    public University ()
    {
        students = new LinkedList<Student>();
        courses = new LinkedList<Course>();
        teachers = new LinkedList<Teacher>();
        classrooms = new LinkedList<Classroom>();
        
        //XML

        LinkedList< String[] > s = Utility.readXML( "student" );
        LinkedList< String[] > t = Utility.readXML( "teacher" );
        LinkedList< String[] > cl = Utility.readXML( "classroom" );
        LinkedList< String[] > co = Utility.readXML( "course" );
        
        //

        LinkedList< String[] > l = Utility.readXML( "lecture" );
        LinkedList< String[] > e = Utility.readXML( "enrollment" );
        LinkedList< String[] > a = Utility.readXML( "assignment" );

        
        for(String[] st: s)
        {
            students.add(new Student(st[0],  Integer.parseInt( st[1] )));
        }

        
        for(String[] te: t)
        {
            teachers.add(new Teacher(te[0]));
        }

        for(String[] cou: co)
        {
            courses.add(new Course(cou[0]));
        }

        for(String[] cla: cl )
        {
            classrooms.add(new Classroom(cla[0]));
        }

        int y,z;
        Student student;
        Course course;
        Classroom classroom;
        Teacher teacher;

        
        Enrollment enrollment;
        for(String[] en: e)
        {
            enrollment = new Enrollment(en[2]);

            //find Student
            //find Course

            student = Utility.getObject(en[0], students); 
            enrollment.addStudent(student);
            course = Utility.getObject(en[1],courses);
            enrollment.addCourse(course);
            
            student.addEnrollment(enrollment);
            course.addEnrollment(enrollment);
        }

        Lecture lecture;
        for(String[] le: l)
        {   
            //x = Integer.parseInt(le[0]);
            y = Integer.parseInt(le[2]);
            z = Integer.parseInt(le[3]);

            lecture = new Lecture(y,z,le[4]);

            //find classroom
            //find course

            classroom = Utility.getObject(le[0],classrooms);
            lecture.addClassroom(classroom);
            classroom.addLecture(lecture);//peta aqui

            course = Utility.getObject(le[1],courses);
            lecture.addCourse(course);
            course.addLecture(lecture);

        }

        Assigment assigment;
        LinkedList<String> groups = new LinkedList<String>();
        int i = 0;
        
        for(String[] as: a)
        {
            while(i<as[i].length())
            {
                if(i>2) groups.add(as[i]);
                i++;
            }
            i = 0;
            assigment = new Assigment(groups);

            //find course
            //find student
            course = Utility.getObject(as[1],courses);
            assigment.addCourse(course);
            course.addAssigment(assigment);
                
            teacher = Utility.getObject(as[0],teachers);
            assigment.addTeacher(teacher);
            teacher.addAssigment(assigment);

            groups.clear();
        }
    

    }

    //convert the types linked list to strings;
    public LinkedList<String> getStudents ()
    {
        LinkedList<String> student_list = new LinkedList<String>();
        student_list = Utility.toString(students); 
        return student_list;
    }

    public LinkedList<String> getTeachers ()
    {
        LinkedList<String> teachers_list = new LinkedList<String>();
        teachers_list = Utility.toString(teachers); 
        return teachers_list;
    }

    public LinkedList<String> getClassrooms ()
    {
        LinkedList<String> class_list = new LinkedList<String>();
        class_list = Utility.toString(classrooms); 
        return class_list;
    }

    public LinkedList<String> getCoruses ()
    {
        LinkedList<String> course_list = new LinkedList<String>();
        course_list = Utility.toString(courses); 
        return course_list;
    }    

    //  
    

    public LinkedList<String> CoursesOfStudent (String name)
    {
        Student student = Utility.getObject(name, students);
        return student.getCourses();
    }

    public LinkedList<String> TeachersOfCourse (String n)
    {
        Teacher teacher = Utility.getObject(n, teachers);
        return teacher.getCourses();
    }
}
