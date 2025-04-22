public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("\n  Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Teacher extends Person{
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole(){
        super.display();
        System.out.println("Subject: "+subject);
        System.out.println("Role: Teacher");
    }
}

class Student extends Person{
    char grade;

    public Student(String name, int age, char grade) {
        super(name, age);
        this.grade = grade;
    }


    void displayRole(){
        super.display();
        System.out.println("Grade: "+grade);
        System.out.println("Role: Student");
    }
}

class Staff extends Person{
    String dept;

    public Staff(String name, int age, String dept) {
        super(name, age);
        this.dept = dept;
    }

    void displayRole(){
        super.display();
        System.out.println("department: "+dept);
        System.out.println("Role: Staff");
    }
}

class Per{
    public static void main(String[] args) {
        Teacher t=new Teacher("Jhon",27,"java");
        Student s=new Student("Alice",20,'A');
        Staff s1=new Staff("Rick",22,"Lab Incharge");

        t.displayRole();
        s.displayRole();
        s1.displayRole();
    }
}