public class Course {

    String courseName;
    double duration;

    public Course(String courseName, double duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void CourseDetails(){
        System.out.println("Couser Name: "+courseName);
        System.out.println("Duration: "+duration);
    }
}

class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, double duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void CourseDetails(){
        super.CourseDetails();
        System.out.println("Platform: "+platform);
        System.out.println("Is recorded: ");
    }
}

class PaidOnlineCourse extends OnlineCourse{
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, double duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void CourseDetails(){
        super.CourseDetails();
        System.out.println("Fee: "+fee);
        System.out.println("Discount: "+discount);
    }
}
class Cour{
    public static void main(String[] args) {
        PaidOnlineCourse p=new PaidOnlineCourse("CG",3,"Offline",false,0,0);
        p.CourseDetails();
    }
}