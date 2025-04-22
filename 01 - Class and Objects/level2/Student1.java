import java.util.Scanner;

public class Student1 {

    String name;
    int RollNo;
    double marks;

    public Student1(String name, int rollNo, double marks) {
        this.name = name;
        RollNo = rollNo;
        this.marks = marks;
    }

    public char grade(double marks){
        char grade;
        if(marks>=91&&marks<=100){
            return 'A';
        }else if(marks>=81&&marks<=90){
            return 'B';
        }else if(marks>=71&&marks<=80){
            return 'C';
        }else if(marks<80){
            return 'F';
        }else{
            System.out.println("Enter valid marks");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of students");
        int n=scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<n;i++){
            System.out.println("Enter name: ");
            String name=scanner.nextLine();
            System.out.println("Enter RollNo: ");
            int RollNo=scanner.nextInt();
            System.out.println("Enter marks: ");
            double marks=scanner.nextDouble();
            scanner.nextLine();

            Student1 obj=new Student1(name,RollNo,marks);
            char grade=obj.grade(marks);
            System.out.println("Grade: "+grade);
        }

    }
}
