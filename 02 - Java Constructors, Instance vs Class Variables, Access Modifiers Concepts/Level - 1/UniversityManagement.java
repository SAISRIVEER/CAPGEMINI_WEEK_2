class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }
}
class PostgraduateStudent extends Student {
    void displayName() {
        System.out.println("Name (Protected): " + name);
    }

    void displayAllDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("CGPA (Private via Getter): " + getCGPA());
    }
}
public class UniversityManagement {
    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent();
        pgStudent.rollNumber = 016;
        pgStudent.name = "Vishal";
        pgStudent.setCGPA(9.4);

        pgStudent.displayName();
        pgStudent.displayAllDetails();
    }
}
