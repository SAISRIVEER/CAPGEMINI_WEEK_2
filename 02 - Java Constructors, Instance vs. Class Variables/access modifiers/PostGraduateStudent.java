class PostgraduateStudent extends Student{

    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }


    public void displayPostgraduateDetails(){


        System.out.println("\n Post Graduate Student Details: ");
        System.out.println("\n Roll Number: "+rollNumber);
        System.out.println("Name: "+name);
        //System.out.println("CGPA: "+CGPA);
    }

    public static void main(String[] args) {
        PostgraduateStudent pgStudent=new PostgraduateStudent(201,"Alice",8.5);
        pgStudent.displayPostgraduateDetails();
    }
}