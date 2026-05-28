import java.util.ArrayList;

class AttendanceManager {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {

        students.add(s);
    }

    // Method Overloading
    public void markAttendance(Student s) {

        s.markAttendance();
    }

    public void markAttendance(Student s, int days) {

        for(int i = 0; i < days; i++) {

            s.markAttendance();
        }
    }

    public void showAllStudents() {

        for(Student s : students) {

            s.displayInfo();

            System.out.println();
        }
    }
}
