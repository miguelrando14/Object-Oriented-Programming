
public class Test {
    //private University university;

    public static void main(String[]args)
    { 
        University university = new University();
        System.out.println("STUDENTS ");
        System.out.println( university.getStudents() );
        System.out.println("TEACHERS ");
        System.out.println( university.getTeachers() );
        System.out.println("CLASSROOMS ");
        System.out.println( university.getClassrooms() );
        System.out.println("COURSES ");
        System.out.println( university.getCoruses() );

        String name = "Ron Weasley";
        System.out.println("RON WEASLEY ");
        System.out.println( university.CoursesOfStudent(name));
        name = "Severus Snape";
        System.out.println("SEVERUS SNAPE ");
        System.out.println( university.TeachersOfCourse(name));


       

       
        
    }
    
}
