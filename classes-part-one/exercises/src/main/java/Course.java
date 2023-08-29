
import java.util.ArrayList;

public class Course {
    private String courseName;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName, Teacher instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }
}
