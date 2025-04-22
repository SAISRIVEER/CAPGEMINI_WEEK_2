public class Employee1 {

    String name;
    int id;
    double salary;


    public Employee1(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void Display(){

        System.out.println("name is: "+name);
        System.out.println("id is: "+id);
        System.out.println("salary is: "+salary);
    }

    public static void main(String[] args) {
        Employee1 person1=new Employee1("Srikaran",414,425000);
        person1.Display();
    }
}
