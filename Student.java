class Student extends Person {

    private int attendanceCount;

    public Student(String name, int id) {

        super(name, id);

        attendanceCount = 0;
    }

    public void markAttendance() {

        attendanceCount++;
    }

    public int getAttendanceCount() {

        return attendanceCount;
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Attendance Count: " + attendanceCount);
    }
}
