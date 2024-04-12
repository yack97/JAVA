import java.util.HashSet;
import java.util.Set;

public class University {

    private String name;
    private Set<Course> courseSet;
    private Set<Student> studentSet;

    public University(String name) {
        this.name = name;
        courseSet = new HashSet<>();
        studentSet = new HashSet<>();
    }

    public void generateCourse(Integer id, String subject){
        Course course = new Course(id, subject );
        courseSet.add(course);
    }

    public void generateStudent (Integer id, String name){
        Student student = new Student(id, name);
        studentSet.add(student);
    }

    public void suscribeStudent(Integer curseID, Integer studentID) throws Exception{
        Course course = findCourse(curseID);
        Student student = findStudent(studentID);

        if (curseID == null){
            throw new CourseNotFoundException(curseID + " Is not a valid ID");
        }

        if (studentID == null){
            throw new StudentNotFoundException(studentID + " is not a valid ID");
        }

        course.addStudent(student);
        System.out.println(student.getName() + " is now: " + course.getSubject());

    }

    private Course findCourse(Integer curseID){
        Course wantedCourse = null;
        for (Course course : courseSet){
            if (course.getId().equals(curseID) ){
                wantedCourse = course;
            }
        }
        return wantedCourse;
    }

    private Student findStudent(Integer studentID){
        Student wantedStudent = null;
        for (Student student : studentSet){
            if (student.getId().equals(studentID)){
                wantedStudent = student;
            }
        }
        return wantedStudent;
    }
}
