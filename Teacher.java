public class Teacher extends Person {
    
    public Teacher(String name, int id) {
        super(name, id);
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher Information:"); // Explains who this person is
        super.displayInfo(); // Correctly prints Name and ID
    }
}






