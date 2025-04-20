class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "SRM IST";
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    void displayCourseDetails() {
        System.out.println(courseName + " | Duration: " + duration + " weeks | Fee: $" + fee + " | Institute: " + instituteName);
    }
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 300);
        Course c2 = new Course("Data Science", 12, 600);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        updateInstituteName("Bridge Labz");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
