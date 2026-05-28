import java.util.ArrayList;

public class AttendanceManager {
    private ArrayList<Student> students;

    public AttendanceManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    // Overloaded Method 1: Mark a single day
    public void markAttendance(Student s) {
        s.markAttendance();
    }

    // Overloaded Method 2: Mark multiple days dynamically
    public void markAttendance(Student s, int days) {
        for (int i = 0; i < days; i++) {
            s.markAttendance();
        }
    }

    public void showAllStudents() {
        System.out.println("Student Records:");
        for (Student s : students) {
            s.displayInfo();
            System.out.println();
        }
    }
}



