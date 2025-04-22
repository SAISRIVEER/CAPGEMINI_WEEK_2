import java.util.Scanner;

class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public static void modifyCGPA(double CGPA){
        double newCGPA=CGPA;
        System.out.println("The cgpa is modified to: "+newCGPA);

    }

    public void displayStudentDetails(){
        System.out.println("Roll no: "+rollNumber);
        System.out.println("Name: "+name);
        System.out.println("CGPA: "+CGPA);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student s1=new Student(41,"Jhon",9.5);
        System.out.println("\nStudents Details are: ");

        s1.displayStudentDetails();

        System.out.println("Enter the new CGPA: ");
        double CGPA=scanner.nextDouble();
        Student.modifyCGPA(CGPA);
        System.out.println("\n Modified details are: ");
        s1.displayStudentDetails();
    }
}


