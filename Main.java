import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. User Input for Student Configuration
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Student ID: ");
        int id = input.nextInt();

        // Instantiate Student Object
        Student s1 = new Student(name, id);

        // 2. Dynamic Input for Attendance Days Tracking
        System.out.print("Enter number of days to mark attendance for " + name + ": ");
        int daysToMark = input.nextInt();

        // Instantiate Teacher Object
        Teacher t1 = new Teacher("Mr John", 201);

        // Initialize Manager and Register Student Record
        AttendanceManager manager = new AttendanceManager();
        manager.addStudent(s1);

        // Process Attendance Calculations
        manager.markAttendance(s1, daysToMark);

        System.out.println();

        // 3. Display Clear Output Stream
        t1.displayInfo();
        System.out.println();
        manager.showAllStudents();

        input.close();
    } // This brace closes the main method
} // This brace closes the public class Main



