import java.util.Scanner;

public class Course {

    String courseName;
    int duration;
    int fee;
    static String instituteName="default name";

    public Course(String courseName, int duration, int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails(){

        System.out.println("Course Name: "+courseName);
        System.out.println("Duration: "+duration);
        System.out.println("Fee: "+fee);
        System.out.println("Institute Name: "+instituteName);

    }

    public static void updateInstituteName(String Name){

        instituteName=Name;
        System.out.println("Institute name is updated with: "+instituteName);

    }

    public static void main(String[] args) {
        Course c1=new Course("CSE",4,350000);
        Course c2=new Course("IT",4,450000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter new institue name: ");
        String institueName=scanner.nextLine();

        Course.updateInstituteName(institueName);
        System.out.println("Display updated results: ");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

    }
}
