import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Student ID: ");
        int id = input.nextInt();

        // Create Student Object
        Student s1 = new Student(name, id);

        // Create Teacher Object
        Teacher t1 = new Teacher("Mr John", 201);

        // Create Manager
        AttendanceManager manager = new AttendanceManager();

        // Add Student
        manager.addStudent(s1);

        // Mark Attendance
        manager.markAttendance(s1, 3);

        System.out.println();

        // Display Teacher
        t1.displayInfo();

        System.out.println();

        // Display Students
        manager.showAllStudents();

        input.close();
    }
}