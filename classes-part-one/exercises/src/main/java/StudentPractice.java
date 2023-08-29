import java.util.ArrayList;
public class StudentPractice {
    public static void main(String[] args) {
        // Instantiate the Student class with your information
        Student student = new Student("Your Name", 12345, 1, 4.0);

        // Print out the student information
        System.out.println("Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Number of Credits: " + student.getNumberOfCredits());
        System.out.println("GPA: " + student.getGpa());
    }
}
