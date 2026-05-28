public class Student extends Person {
    private int attendanceCount;

    public Student(String name, int id) {
        super(name, id);
        this.attendanceCount = 0;
    }

    public void markAttendance() {
        this.attendanceCount++;
    }

    public int getAttendanceCount() {
        return this.attendanceCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Correctly prints Name and ID
        System.out.println("Attendance Count: " + attendanceCount);
    }
}

