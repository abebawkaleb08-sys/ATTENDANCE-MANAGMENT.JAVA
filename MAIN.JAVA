import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. User Input for Student
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Student ID: ");
        int id = input.nextInt();

        // Create Student Object
        Student s1 = new Student(name, id);

        // 2. Dynamic Input for Attendance Days
        System.out.print("Enter number of days to mark attendance for " + name + ": ");
        int daysToMark = input.nextInt();

        // Create Teacher Object
        Teacher t1 = new Teacher("Mr John", 201);

        // Create Manager and Register Student
        AttendanceManager manager = new AttendanceManager();
        manager.addStudent(s1);

        // Mark Attendance using the user-inputted days variable
        manager.markAttendance(s1, daysToMark);

        System.out.println();

        // 3. Display Information (Divider Removed)
        t1.displayInfo();
        System.out.println();
        manager.showAllStudents();

        input.close();
    } // Closes main method
} // Closes public class Main
