class Student {
    static String universityName = "SRM University";
    static int totalStudents = 0;
    final int rollNumber;
    String name, grade;
    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    void display() {
        if (this instanceof Student) {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
        }
    }
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
    public static void main(String[] args) {
        Student s = new Student("Vishal", 16, "A");
        s.display();
        Student.displayTotalStudents();
    }
}
